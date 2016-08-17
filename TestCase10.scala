/*
 * This case is to test the RDD cost implementation	
 * This case covers UnionRDD
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(1 to 3, 3)
val b = sc.parallelize(5 to 7, 2)
val c = a.union(b)
c.collect