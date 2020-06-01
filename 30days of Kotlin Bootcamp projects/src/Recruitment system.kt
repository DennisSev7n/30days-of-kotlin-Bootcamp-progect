// This is a recruitment software that is used to interview a potential employee to work as either a Java or kotlin developer
class Personal{
    // this is a class that will hold the job seeker,s personal details
    var fname: String = ""
    var lname: String = ""
    var age: Int = 0
    var email: String = ""
    var Id: Int = ((Math.random() * 12)+12) .toInt()

    fun input(){
        // He/ She would input her details here
        println("Welcome to Sev7n Industries E-Interview")

        print("Enter your first name:")
        fname = readLine()!!. toString()
        print("Enter last name:")
        lname = readLine()!!. toString()

        print("How old are you:")
        age = readLine()!!. toInt()

        if(age <= 19){
            println("Sorry but you are too young for this job. Try again whe you are older")
        }
else{
            print("Enter your email address:")
            email = readLine()!!. toString()

            println("Here is your Interview ID: $Id ")

        }

    }
}


class Interview{
    // this is the main interview and i will call the personal call into this class. this is known as class collaboration
    var worker1 =Personal()


    var FinalScore: Int = 0
    var answer1: String = ""
    var answer2: String = ""
    var answer3: String = ""
    var answer4: String = ""
    var answer5: String = ""
    var lng: String = ""



    fun start(){
        worker1.input()


        println("Dear MR/ MRS /Ms ${worker1.fname} ${worker1.lname} with ID ${worker1.Id}. Your interview has began")
        println("You would have to choose between Java or Kotlin programming language")

        print("Which language are you fluent in. Java or Kotlin?: ")
         lng = readLine()!!. toString()


        if(lng == "java"){
            println("Welcome to the Java programming language interview")
            println("Select A, B or C in capital letters and make sure you attempt all 5 questions")

            println("1. The name Java was originally gotten from the____")
            println("A. Coffee" + " " + "B. The Java Island " + " " + "C. The Phone OS" )
            print("Answer:")
            answer1= readLine()!!.toString()
            if (answer1== "B"){
                FinalScore += 10
            }

            println("2.What statement is used to print out  a sentence in Java?")
            println("A.System.out.print" + " " + "B.System.in.print" + " " + "C.Print")
            print("Answer:")

            answer2 = readLine()!!. toString()
            if (answer2 == "A"){
                FinalScore += 10
            }

            println("3.What is the full meaning of jdk")
            println("A.Java Deployment Kit" + " " + "B.Java Development Kit" + " " + "C.Java Development Kindle")
            print("Answer:")
            answer3 = readLine()!!. toString()
            if (answer3 == "B"){
                FinalScore += 10
            }

            println("4.Java is popularly known to be used for____")
            println("A.Web Development" + " " + "B.Database Management" + " " + "C.Android/ software development")
            print("Answer:")
            answer4 = readLine()!!.toString()
            if (answer4 == "C"){
                FinalScore += 10
            }

            println("5.What kind of language is Java")
            println("A.An object oriented language" + " " + "B.A scripting language" + " " + "C.A procedural language")
            print("Answer:")
            answer5 = readLine()!!.toString()
            if (answer5 == "A"){
                FinalScore += 10
            }
        }


        else if (lng == "kotlin"){
            println("Welcome to the Kotlin programming language interview")
            println("Select A, B or C in capital letters and make sure you attempt all 5 questions")

            println("1.Kotlin was gotten from which language")
            println("A.C++" + " " + "B.Java" + " " + "C.Python")
            print("Answer:")
            answer1 = readLine()!!.toString()
            if (answer1 == "B"){
                FinalScore +=10
            }
            println("2.What statement is used in kotlin to request an input ")
            println("A.System.input()" + " " + "B.Read.input()" + " " + "C.readline()")
            print("Answer:")
            answer2 = readLine()!!. toString()
            if (answer2 == "C"){
                FinalScore += 10
            }

            println("3.When saving a kotlin file, what extension do you use")
            println("A.kt" + " " + "B.jar" + " " + "C.js")
            print("Answer:")
            answer3 = readLine()!!. toString()
            if (answer3 == "A"){
                FinalScore += 10
            }

            println("4.What statement is used to print a sentence in kotlin:")
            println("A.println()" + " " + "B.document.out()" + " " + "C.system.out.print()")
            print("Answer:")
            answer4 = readLine()!!.toString()
            if (answer4 == "A"){
                FinalScore +=10
            }

            println("5. Which year was kotlin officially released")
            print("A.2020" + " " + "B.2001" + " " + "C.2017")
            print("Answer:")
            answer5 = readLine()!!.toString()
            if (answer5 == "C"){
                FinalScore += 10
            }




        }
    }


    fun end(){
        println("Dear ${worker1.fname} ${worker1.lname}, you have come to the end of your interview")
        println("You chose your language to be $lng and you have attempted all 5 questions ")
        println("Here is your score: you scored $FinalScore out of 50")

        if (FinalScore >=30){
            println("Congratulations you passed the exam and you are eligible for a physical interview. Expect our email")

        }
        else{
            println("Sorry buy you did not reach the required mark. Try again next year")
        }
    }
}

fun main(){
   var interview1 = Interview()
    interview1.start()
    interview1.end()

}





