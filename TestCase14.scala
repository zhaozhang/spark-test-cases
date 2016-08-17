/*
 * This case is to test the RDD cost implementation	
 * This case covers ZippedPartitionsRDD3
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(1 to 3, 2)
val b = sc.parallelize(5 to 7, 2)
val c = sc.parallelize(8 to 10, 2)
val d = sc.parallelize(11 to 13, 2)

def myfunc(aiter: Iterator[Int], biter: Iterator[Int], citer: Iterator[Int], diter: Iterator[Int]): Iterator[String] =
{
  var res = List[String]()
  while (aiter.hasNext && biter.hasNext && citer.hasNext && diter.hasNext)
  {
    val x = aiter.next + " " + biter.next + " " + citer.next + " " + diter.next
    res ::= x
  }
  res.iterator
}

val e = a.zipPartitions(b, c, d)(func)
e.collect