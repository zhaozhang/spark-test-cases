/*
 * This case is to test the RDD cost implementation	
 * This case covers ZippedPartitionsRDD3
 */

sc.setLogLevel("INFO")
val a = sc.parallelize(1 to 3, 2)
val b = sc.parallelize(5 to 7, 2)
val c = sc.parallelize(8 to 10, 2)

def myfunc(aiter: Iterator[Int], biter: Iterator[Int], citer: Iterator[Int]): Iterator[String] =
{
  var res = List[String]()
  while (aiter.hasNext && biter.hasNext && citer.hasNext)
  {
    val x = aiter.next + " " + biter.next + " " + citer.next
    res ::= x
  }
  res.iterator
}

val d = a.zipPartitions(b, c)(func)
d.collect