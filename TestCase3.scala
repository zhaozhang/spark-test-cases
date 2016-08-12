/*
 * This case is to test the RDD cost implementation	
 * This case covers NewHadoopRDD and MapPartitionsRDD
 */

sc.setLogLevel("INFO")
val files = sc.textFile("conf/", 2)
files.count