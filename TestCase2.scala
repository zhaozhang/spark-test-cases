/*
 * This case is to test the RDD cost implementation	
 * This case covers HadoopRDD and MapPartitionsRDD
 */

sc.setLogLevel("INFO")
val lines = sc.textFile("README.md", 4)
lines.count