public class Grader {
    public char grades(int num){
        if(num < 60){
            return 'F';
        }
        else if(num < 70){   //as the condition is defined by 70, 70 is an edge case so we need to make test cases for all the edge cases
            return 'D';
        }
        else if(num < 80){
            return 'C';
        }
        else if(num < 90){
            return 'B';
        }
       else{
           return 'A';
        }
    }
}
