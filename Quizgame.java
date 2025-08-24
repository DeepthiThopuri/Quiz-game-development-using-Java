
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.Desktop;
public class Backend {
     private int score = 0;   // keep track of score
    private int total = 5;
    public void loginPage(){
System.out.println("===Welcome To Online Quiz!===");
    }
    public void choiceAdd(int choice){

         switch(choice){
          case 1:
             System.out.println("Now you have the quiz on C Language:\n✨ All the Best! 👍🎯");
             cTest();
             break;
            
           case 2:
                System.out.println("Now you have the quiz on python:\n\u2728 All the Best! 👍🎯");
                pythonTest();
                break;
            
            case 3:
                System.out.println("Now you have the quiz on Java:\n✨ All the Best! 👍🎯");
                javaTest();
                break;
            
            case 4:
                System.out.println("Now you have the quiz on GK:\n✨ All the Best! 👍🎯");
                gkTest();
                break;
            
            default:System.out.println("choose correct choice");break;
        }
    }
    

    // ✅ C Language Quiz
    public void cTest() {
        Scanner sc = new Scanner(System.in);
        score = 0; // reset score

        System.out.println("\nC Language Quiz");
        System.out.println("Q1) Who is the father of C Language?\n1.Dennis Ritchie  2.James Gosling  3.Bjarne Stroustrup  4.Guido van Rossum");
        if (sc.nextInt() == 1) score++;

        System.out.println("Q2) C Language is a ...?\n1.Object Oriented  2.Procedural  3.Functional  4.None");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q3) Which symbol is used to end a statement in C?\n1.,  2.:  3.;  4.?");
        if (sc.nextInt() == 3) score++;

        System.out.println("Q4) C language was developed in?\n1.1972  2.1980  3.1991  4.2000");
        if (sc.nextInt() == 1) score++;

        System.out.println("Q5) Which of these is not a C keyword?\n1.int  2.float  3.string  4.char");
        if (sc.nextInt() == 3) score++;

        scoreDisplay();
    }
    // ✅ Python Quiz
    public void pythonTest() {
        Scanner sc = new Scanner(System.in);
        score = 0;

        System.out.println("\nPython Quiz");
        System.out.println("Q1) Who created Python?\n1.Dennis Ritchie  2.Guido van Rossum  3.Larry Page  4.James Gosling");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q2) Python was first released in?\n1.1980  2.1991  3.2000  4.2010");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q3) Which keyword is used for function in Python?\n1.function  2.def  3.fun  4.method");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q4) Python is ...?\n1.Compiled  2.Interpreted  3.Both  4.None");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q5) Which of these is a Python data type?\n1.tuple  2.sequence  3.character  4.byte");
        if (sc.nextInt() == 1) score++;

        scoreDisplay();
    }
    

    // ✅ Java Quiz
    public void javaTest() {
        Scanner sc = new Scanner(System.in);
        score = 0;

        System.out.println("\nJava Quiz");
        System.out.println("Q1) Java was developed by?\n1.Sun Microsystems  2.Microsoft  3.Google  4.IBM");
        if (sc.nextInt() == 1) score++;

        System.out.println("Q2) Java is ...?\n1.Platform dependent  2.Platform independent  3.OS dependent  4.None");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q3) Which keyword is used to inherit a class?\n1.inherit  2.extends  3.implements  4.super");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q4) JVM stands for?\n1.Java Virtual Machine  2.Java Variable Method  3.Java Visual Model  4.None");
        if (sc.nextInt() == 1) score++;

        System.out.println("Q5) Which is not a Java feature?\n1.Object-Oriented  2.Secure  3.Slow  4.Dynamic");
        if (sc.nextInt() == 3) score++;

        scoreDisplay();
    
    }
    

    // ✅ GK Quiz
    public void gkTest() {
        Scanner sc = new Scanner(System.in);
        score = 0;

        System.out.println("\nGK Quiz");
        System.out.println("Q1) Capital of India?\n1.Mumbai  2.New Delhi  3.Kolkata  4.Chennai");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q2) Who is known as the Father of the Nation (India)?\n1.Nehru  2.Gandhi  3.Bose  4.Ambedkar");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q3) Which is the national bird of India?\n1.Parrot  2.Peacock  3.Crow  4.Sparrow");
        if (sc.nextInt() == 2) score++;

        System.out.println("Q4) Which is the largest planet in the solar system?\n1.Mars  2.Saturn  3.Jupiter  4.Venus");
        if (sc.nextInt() == 3) score++;

        System.out.println("Q5) Who wrote the Indian national anthem?\n1.Tagore  2.Premchand  3.Gandhi  4.Nehru");
        if (sc.nextInt() == 1) score++;

        scoreDisplay();
    }

     // ✅ Method to show score through Web page

public void scoreDisplay() {
    try {
        String htmlContent = "<!DOCTYPE html>\n<html>\n<head>\n<title>Quiz Score</title>\n"
                + "<style>\n"
                + "body { font-family: Arial; text-align: center; padding: 50px; background-color: #f0f8ff;}\n"
                + ".score { font-size: 24px; margin: 20px; }\n"
                + ".message { font-size: 28px; }\n"
                + "</style>\n</head>\n<body>\n"
                + "<h1>*** SCORE CARD ***</h1>\n"
                + "<div class='score'>You scored: " + score + " out of " + total + "</div>\n";

        if(score == total) {
            htmlContent += "<div class='message' style='color:green'>🌟 Excellent Job! 🎉👏 You got all answers correct!</div>\n";
        } else if(score >= total / 2) {
            htmlContent += "<div class='message' 'color:blue'>👍 Good Effort! 💪 Keep practicing!</div>\n";
        } else {
            htmlContent += "<div class='message' style='color:red;'>🙂 Don’t worry, try again! 📘</div>\n";
        }

        htmlContent += "</body>\n</html>";

        // Write HTML file
        String fileName = "QuizScore.html";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(htmlContent);
        writer.close();

        // Open automatically in default browser
        Desktop.getDesktop().browse(new File(fileName).toURI());

    } catch (Exception e) {
        e.printStackTrace();
    }
}

public static void main(String[] args){
    Backend obj=new Backend();
    Scanner sc=new Scanner(System.in);
    obj.loginPage();
    
        try {
            Thread.sleep(1000); // pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     System.out.println("choose the topic for quiz:\n 1.C Language\n 2.python\n 3.java\n 4.GK");
    int ch=sc.nextInt();
    obj.choiceAdd(ch);
}
}