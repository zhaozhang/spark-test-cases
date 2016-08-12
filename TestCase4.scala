/*
 * This case is to test the RDD cost implementation	
 * This case covers CartesionRDD
 */

sc.setLogLevel("INFO")
val r1 = sc.parallelize(List(1,2,3,4), 2)
val r2 = sc.parallelize(List(5,6,7,8), 2)
val r3 = r1.cartesian(r2)
r3.count