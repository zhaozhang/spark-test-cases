/*
 * This case is to test the RDD cost implementation	
 * This case covers CoalesceRDD
 */

sc.setLogLevel("INFO")
val r1 = sc.parallelize(0 until 1000000, 4)
val r2 = r1.coalesce(2)
r2.count