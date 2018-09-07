package Test

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

/**
  *
  * @project OnTrackTest
  * @author sergaben on 01/09/2018.
  *
  */
class Question1b {
  //B - chain dependency f4 <= f3 <= f2 <= f1

  private def f1d : Future[Unit] = Future(println("hello"))
  private def f2d : Future[Unit] = Future(println("Goodbye"))
  private def f3d : Future[Unit] = Future(println("how are you?"))
  private def f4d : Future[Unit] = Future(println("not bad"))


  val result: Unit = f4d.onComplete{ // too verbose probably ?
                case Failure(e) => e.printStackTrace()
                case Success(unit) => f3d.onComplete{
                  case Failure(exception) => exception.getStackTrace
                  case Success(anotherUnit) => f2d.onComplete{
                    case Failure(exception) => exception.getStackTrace
                    case Success(otherUnit) => f1d.onComplete{
                      case Failure(exception) => exception.getStackTrace
                      case Success(yetAnotherUnit) => yetAnotherUnit
                    }
                  }
                }
  }


}
