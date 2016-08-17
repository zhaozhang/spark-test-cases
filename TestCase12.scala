/*
 * This case is to test the RDD cost implementation	
 * This case covers ZippedPartitionsRDD
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(1 to 3, 2)
val b = sc.parallelize(5 to 7, 2)
val c = a.zip(b)
c.collect