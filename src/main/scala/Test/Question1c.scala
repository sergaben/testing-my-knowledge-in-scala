package Test

import scala.concurrent.{ExecutionContext, Future}

/**
  *
  * @project OnTrackTest
  * @author sergaben on 05/09/2018.
  *
  */
class Question1c {

  implicit val ec: ExecutionContext = ExecutionContext.global

  def f1 : Future[Unit] = Future(println("This has no dependency"))
  def f2 : Future[Unit] = Future(println("dependant on f1"))
  def f3 : Future[Unit] = Future(println("dependant on f1"))
  def f4 : Future[Unit] = Future(println("dependant on f3 and f2"))


}
