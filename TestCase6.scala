/*
 * This case is to test the RDD cost implementation	
 * This case covers CoGroupRDD
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(0 until 10000,2)
val b = a.map((_, 'b'))
val c = a.map((_, 'c'))
val r = b.cogroup(c)
r.count