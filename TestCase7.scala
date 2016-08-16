/*
 * This case is to test the RDD cost implementation	
 * This case covers PartitionwiseSampledRDD
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(1 to 10000,3)
val b = a.sample(false, 0.1, 0)
b.count