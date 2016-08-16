/*
 * This case is to test the RDD cost implementation	
 * This case covers ShuffledRDD
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(List(("dog",1), ("cat",2), ("owl",3), ("gnu",4), ("ant",5)), 2)
val b = a.sortByKey(true)
b.count