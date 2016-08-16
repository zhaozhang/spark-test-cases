/*
 * This case is to test the RDD cost implementation	
 * This case covers SubtractedRDD
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(1 to 9, 3)
val b = sc.parallelize(1 to 3, 3)
val c = a.subtract(b)
c.collect