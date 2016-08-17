/*
 * This case is to test the RDD cost implementation	
 * This case covers ZipWithIndexRDD
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(1 to 3, 3)
val b = a.zipWithIndex()
b.collect