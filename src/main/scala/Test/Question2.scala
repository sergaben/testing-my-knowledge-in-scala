package Test

/**
  *
  * @project OnTrackTest
  * @author sergaben on 30/08/2018.
  *
  */
class Question2 {


  def incrementValuesByOne(sequence: Seq[Int]):Unit = {
    val lotsOfSequences = sequence.sliding(1).foreach(x => println(x))
    lotsOfSequences
  }

  def splitNumberIntoDigits(numberAsSeq: Seq[Int])  ={

    if(numberAsSeq.nonEmpty){ // had the idea but could not manage to do it
        //size == 1
            // number == 9
              // add 1 -> 10
                // split the resulting number in two elements like 10 -> 1,0
                // seq(9) => seq(1,0)
            // number != 9
              // add 1 -> e.g 6+1=7
         //size == 2
            // tail == 9
              // add 1 -> 10
                // split 10 into two seqs
    }else{
      Nil
    }
  }



}
