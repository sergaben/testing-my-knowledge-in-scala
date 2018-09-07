package Test

import scala.concurrent.{ExecutionContext, Future}

/**
  *
  * @project OnTrackTest
  * @author sergaben on 30/08/2018.
  *
  */
class Question1a {

  implicit val ec: ExecutionContext = ExecutionContext.global
  //Question 1

  // A - no dependencies between futures
  def f1 : Future[Unit] = Future(println("Hello"))
  def f2 : Future[Unit] = Future(println("world"))
  def f3 : Future[Unit] = Future(println("how is it going ?"))
  def f4 : Future[Unit] = Future(println("not bad :D"))

  f1 foreach( unit => unit) // only succesful no failure handling
  f2 foreach( unit => unit) // only succesful no failure handling
  f3 foreach( unit => unit) // only succesful no failure handling
  f4 foreach( unit => unit) // only succesful no failure handling




}
