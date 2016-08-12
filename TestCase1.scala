/*
 * This case is to test the RDD cost implementation	
 * This case covers ParallelCollectionRDD and MapPartitionsRDD
 */
 
sc.setLogLevel("INFO")
val l = List(1,2,3,4)
val rdd = sc.parallelize(l,4)
val rdd2 = rdd.map(x => {Thread.sleep(3000); x*2})
val rdd3 = rdd2.map(x => {Thread.sleep(5000); x*2})
rdd3.count
