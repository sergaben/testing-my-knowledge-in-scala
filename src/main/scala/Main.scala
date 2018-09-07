import Test.Question2

/**
  *
  * @project OnTrackTest
  * @author sergaben on 30/08/2018.
  *
  */
object Main extends App {

  // Question 1a - Independent Futures

    // val question1a = new Question1a

  // Question 1b - Dependent futures in a chain

//     val question1b = new Question1b
//     println(question1b.result)


  // Question 1c - Another kind of dependency on futures



  // Question 2 - Adding one to the last element of a seq

      val question2 = new Question2
      val result = question2.incrementValuesByOne(Nil)
//  println(question1b.getFutureResult.onComplete{
//    case Success(st) => st
//  })



  // Question 6 - Option

      // val question6 = new Question6

      // Option has some value

      // val firstWayWithValue = question6.myStringOptionSomeValue.getOrElse("No value was found")
      // val secondWayWithValue = question6.myStringOptionSomeValue.fold("Value not found")(x => x)

      // Option has None

      // val fistWayWithoutValue = question6.myStringOptionNoValue.getOrElse("Value not found")
      // val secondWayWithoutValue = question6.myStringOptionNoValue.fold("Value not found")(x => x)

}
