this is the code for the binary search :



import java.util.\*;

public class Main{

&#x20;   public static int search(int\[] num , int target){

&#x20;       int left =0;

&#x20;       int right = num.length -1;

&#x20;       while(left<=right){

&#x20;           int mid = left +(right-left)/2;

&#x20;           if(num\[mid]==target){

&#x20;               return mid;

&#x20;           }

&#x20;           else  if(num\[mid]<target){

&#x20;               left = mid +1;

&#x20;           }

&#x20;           else {

&#x20;               right = right -1;

&#x20;           }

&#x20;       }

&#x20;       return -1;

&#x20;   }

&#x20;   public static void main(String\[] arg){

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       int target  = sc.nextInt();

&#x20;       int n = sc.nextInt();

&#x20;      int\[] arr = new int\[n];

&#x20;      for(int i=0;i<n;i++){

&#x20;          arr\[i] = sc.nextInt();

&#x20;      }

&#x20;      int index =search(arr , target);

&#x20;      System.out.print(index);

&#x20;

&#x20;   }

}







code for the binary search this is a error code





import java.util.\*;



public class Main {



&#x20;   public static int search(int\[] num , int target){

&#x20;       int left = 0;

&#x20;       int right = num.length - 1;



&#x20;       while(left <= right){

&#x20;           int mid = left + (right - left) / 2;



&#x20;           if(num\[mid] == target){

&#x20;               return mid;

&#x20;           }

&#x20;           else if(num\[mid] < target){

&#x20;               left = mid + 1;

&#x20;           }

&#x20;           else{

&#x20;               right = mid - 1;

&#x20;           }

&#x20;       }



&#x20;       return -1;

&#x20;   }



&#x20;   public static void main(String\[] args){

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       int target = sc.nextInt();

&#x20;       int n = sc.nextInt();



&#x20;       int\[] arr = new int\[n];



&#x20;       for(int i = 0; i < n; i++){

&#x20;           arr\[i] = sc.nextInt();

&#x20;       }



&#x20;       int index = search(arr, target);

&#x20;       System.out.println(index);

&#x20;   }

}

&#x20;



this is the correct code for the binary search to mind the target element







this is the code for to find the maxsub array by using the





import java.util.\*;



public class Main {

&#x20;   public static int maxdays(int\[] arr ){

&#x20;       int currentsum =0, max  = arr\[0];

&#x20;       for(int i :arr){

&#x20;           currentsum+=i;

&#x20;           if(currentsum>max){

&#x20;               max = currentsum;

&#x20;           }

&#x20;           else if(currentsum<0){

&#x20;               currentsum=0;

&#x20;           }

&#x20;       }

&#x20;       return currentsum;

&#x20;   }

&#x20;   public static void main(){

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       int n = sc.nextInt();

&#x20;       int\[] arr= new int\[n];

&#x20;       for(int i=0;i<n;i++){

&#x20;           arr\[i]=sc.nextInt();

&#x20;       }

&#x20;       int value = maxdays(arr);

&#x20;       System.out.print(value);

&#x20;   }

&#x20;

}







here one main concept that is that if the currentsum is negative then make it zero that the main think .









this is to find the min cost to move the chips to same place , in that to move two position i cost 0 and to move one position i cost 1:





code:



import java.util.\*;



public class Main {

&#x20;   public static int minCostToMoveChips(int\[] position) {

&#x20;       int no = 0; // odd count

&#x20;       int ne = 0; // even count



&#x20;       for(int i = 0; i < position.length; i++){

&#x20;           if(position\[i] % 2 == 0){

&#x20;               ne++;

&#x20;           }

&#x20;           else{

&#x20;               no++;

&#x20;           }

&#x20;       }



&#x20;       return Math.min(no, ne);

&#x20;   }



&#x20;   public static void main(String\[] args){

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       int n = sc.nextInt();

&#x20;       int\[] arr = new int\[n];



&#x20;       for(int i = 0; i < n; i++){

&#x20;           arr\[i] = sc.nextInt();

&#x20;       }



&#x20;       int value = minCostToMoveChips(arr);

&#x20;       System.out.print(value);

&#x20;   }

}







how to find the max worthy man the value of the mans for each bank is give then find it :





import java.util.\*;



public class Main {

&#x20;   public static int maximumWealth(int\[]\[] accounts) {

&#x20;       int n=accounts.length;

&#x20;       int nc = accounts.length;

&#x20;       int currentsum=0;

&#x20;       int max =Integer.MIN\_VALUE;

&#x20;       for(int i =0;i<n;i++){

&#x20;           for(int j =0;j<nc;j++){

&#x20;               currentsum+=accounts\[i]\[j];

&#x20;           }

&#x20;           if(currentsum>max){

&#x20;               max = currentsum;

&#x20;           }

&#x20;           currentsum =0;

&#x20;       }

&#x20;       return max;

&#x20;   }



&#x20;   public static void main(String\[] args){

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       int n = sc.nextInt();

&#x20;       int m = sc.nextInt();

&#x20;       int\[]\[] arr = new int\[n]\[m];



&#x20;       for(int i = 0; i < n; i++){

&#x20;           for(int j=0;j<m;j++){

&#x20;             arr\[i]\[j] = sc.nextInt();

&#x20;           }

&#x20;       }



&#x20;       int value = maximumWealth(arr);

&#x20;       System.out.print(value);

&#x20;   }

}



this is the code for that .







to find that the sinfunction of a product of a array is + or - or 0:





import java.util.\*;



public class Main {

&#x20;   public static int arraySign(int\[] nums) {

&#x20;       int product =1;

&#x20;       int count=0;

&#x20;       for(int i : nums){

&#x20;           if(i<0){

&#x20;               count++;

&#x20;           }

&#x20;           else if (i ==0){

&#x20;               return 0;

&#x20;           }

&#x20;       }

&#x20;       if(count%2==0){

&#x20;           return 1;

&#x20;       }

&#x20;       return -1;

&#x20;   }





&#x20;   public static void main(String\[] args){

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       int n = sc.nextInt();

&#x20;

&#x20;       int\[] arr = new int\[n];



&#x20;       for(int i = 0; i < n; i++){

&#x20;             arr\[i] = sc.nextInt();

&#x20;           }



&#x20;       int value = arraySign(arr);

&#x20;       System.out.print(value);

&#x20;   }

}





this is by calculate the count of the negative sign because if  we try to find this by multiply the values it may exicd the limit of the integer so we use this











import java.util.\*;



public class Main {

&#x20;   public static String categorizeBox(int length, int width, int height, int mass) {

&#x20;    long volume = (long)length\*(long)width\*(long)height;

&#x20;    long digitV =(long)(Math.log10(volume)+1);

&#x20;    if(digitV>9 \&\& mass>=100){

&#x20;       return "Both";

&#x20;    }

&#x20;    else if(digitV>9 || length>=10000 || width>=10000 || height>=10000){

&#x20;       return "Bulky";

&#x20;    }

&#x20;    else if(mass>=100){

&#x20;       return "Heavy";

&#x20;    }

&#x20;    else{

&#x20;       return "Neither";

&#x20;    }

&#x20;   }





&#x20;   public static void main(String\[] args){

&#x20;       Scanner sc = new Scanner(System.in);



&#x20;       int n = sc.nextInt();

&#x20;       int b = sc.nextInt();

&#x20;       int c = sc.nextInt();

&#x20;       int mass = sc.nextInt();

&#x20;       String value = categorizeBox(n , b , c ,mass);

&#x20;       System.out.print(value);

&#x20;   }

}





here in this just a comparing think but in this i use the math fun to find this and also , in this when we try to multiply to find the volume that is very large so we want typecast every think to make it long .





find the max odd number from this binary string in put :





import java.util.\*;



public class Main {

&#x20;  public static  String maximumOddBinaryNumber(String s) {

&#x20;       StringBuilder sv  = new StringBuilder("");

&#x20;       for(char sb : s.toCharArray()){

&#x20;               if(sb =='1'){

&#x20;                   sv.insert(0,sb);

&#x20;               }

&#x20;               else{

&#x20;                   sv.append(sb);

&#x20;               }

&#x20;       }

&#x20;       sv.deleteCharAt(0);

&#x20;       sv.append("1");

&#x20;       String string = sv.toString();

&#x20;       return string;

&#x20;   }





&#x20;   public static void main(String\[] args){

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       String binary = sc.nextLine();

&#x20;       String value = maximumOddBinaryNumber(binary);

&#x20;       System.out.print(value);

&#x20;   }

}



this is the optimized version :

public static String maximumOddBinaryNumber(String s) {

&#x20;   StringBuilder ones = new StringBuilder();

&#x20;   StringBuilder zeros = new StringBuilder();

&#x20;

&#x20;   // We need to save exactly one '1' for the very end.

&#x20;   boolean savedOneForEnd = false;

&#x20;

&#x20;   // 1. Separate the characters into two buckets

&#x20;   for (int i = 0; i < s.length(); i++) {

&#x20;       if (s.charAt(i) == '1') {

&#x20;           if (!savedOneForEnd) {

&#x20;               savedOneForEnd = true; // Keep the first '1' we find for the end

&#x20;           } else {

&#x20;               ones.append('1');      // Put the rest in the 'ones' bucket

&#x20;           }

&#x20;       } else {

&#x20;           zeros.append('0');         // Put all '0's in the 'zeros' bucket

&#x20;       }

&#x20;   }

&#x20;

&#x20;   // 2. Combine them: ones bucket + zeros bucket + the saved '1'

&#x20;   return ones.append(zeros).append("1").toString();

}



and this the counting method :





import java.util.Scanner;



public class Main {

&#x20;   public static String maximumOddBinaryNumber(String s) {

&#x20;       int countOnes = 0;

&#x20;       int n = s.length();

&#x20;

&#x20;       // 1. Count the total number of '1's

&#x20;       for (int i = 0; i < n; i++) {

&#x20;           if (s.charAt(i) == '1') {

&#x20;               countOnes++;

&#x20;           }

&#x20;       }

&#x20;

&#x20;       StringBuilder result = new StringBuilder();

&#x20;

&#x20;       // 2. Append all '1's at the beginning (except the one we need for the end)

&#x20;       for (int i = 0; i < countOnes - 1; i++) {

&#x20;           result.append('1');

&#x20;       }

&#x20;

&#x20;       // 3. Append all the '0's in the middle

&#x20;       for (int i = 0; i < n - countOnes; i++) {

&#x20;           result.append('0');

&#x20;       }

&#x20;

&#x20;       // 4. Append the final '1' at the end to make it odd

&#x20;       result.append('1');

&#x20;

&#x20;       return result.toString();

&#x20;   }



&#x20;   public static void main(String\[] args){

&#x20;       Scanner sc = new Scanner(System.in);

&#x20;       System.out.print("Enter binary string: ");

&#x20;       String binary = sc.nextLine();

&#x20;       String value = maximumOddBinaryNumber(binary);

&#x20;       System.out.println(value);

&#x20;   }

}











Day 7:



polymorphism

poly-> many

morph->forms

polymorphism means one thing existing

in different forms

in coding ->one method existing in different behaviours





in this two types



compile time polymorphism(method overloading ) ->same name different parameters

run time polymorphism(method overriding )->name same



when you override you must use the anotation

@override -> it show the error in the overwrite other wise it doesn't show









Task : Mini game

game have 3 characters-

warrior, archer, mage

All character have attack

warrior ->attack with sword

archer->attack with magic

one common reference(name);









leetcode 42



my brout force code:



&#x09;class Solution {

&#x20;   public int trap(int\[] height) {

&#x20;       int current;

&#x20;       int boundary = -1;

&#x20;       int intermidiate = 0;

&#x20;       int sum = 0;



&#x20;       for (int i = 0; i < height.length - 1; i++) {

&#x20;           current = height\[i];



&#x20;           if (current > height\[i + 1]) {



&#x20;               boundary = -1;



&#x20;               for (int j = i + 1; j < height.length; j++) {

&#x20;                   if (height\[j] >= current) {

&#x20;                       boundary = j;

&#x20;                       break;

&#x20;                   }

&#x20;               }



&#x20;               if (boundary != -1) {

&#x20;                   for (int k = i + 1; k < boundary; k++) {

&#x20;                       sum += current - height\[k];

&#x20;                   }

&#x20;                   i = boundary - 1;

&#x20;               }

&#x20;           }

&#x20;       }

&#x20;       return sum;

&#x20;   }

}

&#x20;











hw 11 , 54:





724:



class Solution {

&#x20;   public int pivotIndex(int\[] nums) {

&#x20;       int totalsum =0;

&#x20;       for(int i=0;i<nums.length();i++){

&#x20;           totalsum+=nums\[i];

&#x20;       }

&#x20;int k=0;

&#x20;       while(true){

&#x20;       for(int j = k+1;j<nums.length;j++){

&#x20;           int rightsum=0;

&#x20;           rightsum +=nums\[k];

&#x20;       }

&#x20;       if(totalsum-rightsum-nums\[k]==(totalsum/2)-nums\[k]){

&#x20;           return k+1;

&#x20;           break;

&#x20;       }

&#x20;       else if(k==nums.length){

&#x20;           break;

&#x20;       }

&#x20;       k++;

&#x20;       }

&#x20;       return -1;

&#x20;   }

}

not  completed answer;







public class TestP{

&#x20;   public static void main(String \[] args){

&#x20;       String s = "words with even length";

&#x20;       StringBuilder sb = new StringBuilder();

&#x20;       for(int i =0;i<s.length();i++){

&#x20;           int count =0;

&#x20;           if(s.charAt(i)!=' '\&\& (i==0||s.charAt(i-1)==' ')){

&#x20;               StringBuilder temp = new StringBuilder();

&#x20;               while(s.charAt(i)!=' ' \&\& i!=s.length()-1){

&#x20;                   count++;

&#x20;                   temp.append(s.charAt(i));

&#x20;                   i++;

&#x20;               }

&#x20;               if(count%2==0){

&#x20;                   sb.append(' ');

&#x20;                   sb.append(temp);

&#x20;               }

&#x20;               if(i==s.length()-1){

&#x20;                   break;

&#x20;               }

&#x20;           i--;

&#x20;           }

&#x20;       }

&#x20;       System.out.print(sb.toString());

&#x20;       }

}









3163





wornge code



class Solution {

&#x20;   public String compressedString(String word) {

&#x20;       int \[] arr = new int\[26];

&#x20;       StringBuilder sb = new StringBuilder();

&#x20;       for(int i=0;i<word.length();i++){

&#x20;           if(word.charAt(i)>='a' \&\& word.charAt(i)<='z'){

&#x20;               arr\[word.charAt(i)-'a']++;

&#x20;           }

&#x20;       }

&#x20;       for(int j=0;j<26;j++){

&#x20;           if(arr\[j]>0){

&#x20;           if(arr\[j]>9){

&#x20;               sb.append(9);

&#x20;               sb.append((char)(j+'a'));

&#x20;               sb.append((arr\[j]%9));

&#x20;               sb.append((char)(j+'a'));



&#x20;           }

&#x20;           else{

&#x20;               sb.append(arr\[j]%9);

&#x20;               sb.append((char)(j+'a'));

&#x20;           }

&#x20;       }

&#x20;       }

&#x20;       return sb.toString();

&#x20;   }

}









worng code





class Solution {

&#x20;   public String compressedString(String word) {

&#x20;       StringBuilder sb = new StringBuilder();

&#x20;       for(int i=0;i<word.length();i++){

&#x20;           char ch = word.charAt(i);

&#x20;           int count =0;

&#x20;               while (i<word.length() \&\&( word.charAt(i+1)!=ch||){

&#x20;                   count++;

&#x20;                   i++;

&#x20;               }

&#x20;           if(count>9){

&#x20;               sb.append(9);

&#x20;               sb.append((char)(ch));

&#x20;               sb.append(count%9);

&#x20;               sb.append((char)(ch));

&#x20;           }

&#x20;           else{

&#x20;               sb.append(count);

&#x20;               sb.append(ch);

&#x20;           }

&#x20;           i--;



&#x20;           }

&#x20;           return sb.toString();

&#x20;       }

&#x20;   }













class Solution {

&#x20;   public String compressedString(String word) {

&#x20;       StringBuilder sb = new StringBuilder();



&#x20;       for(int i = 0; i < word.length(); i++){

&#x20;           char ch = word.charAt(i);

&#x20;           int count = 1;   // ✔ FIX



&#x20;           while (i + 1 < word.length() \&\& word.charAt(i + 1) == ch) {  // ✔ FIX

&#x20;               count++;

&#x20;               i++;

&#x20;           }

&#x20;           if(count>9){

&#x20;           for(int k=0;k<count/9;k++){

&#x20;

&#x20;               sb.append(9);

&#x20;               sb.append(ch);

&#x20;

&#x20;

&#x20;           }

&#x20;           if(count%9!=0){

&#x20;           sb.append(count % 9);

&#x20;               sb.append(ch);

&#x20;           }

&#x20;           }

&#x20;           else{

&#x20;               sb.append(count);

&#x20;               sb.append(ch);

&#x20;           }

&#x20;       }



&#x20;       return sb.toString();

&#x20;   }

}















Holiday leetcode program :

6,13,15,18,38.



















leetcode problem :

6





wrong code:



public class String5 {

&#x20;   public static void main(String \[] args){

&#x20;   String s="pan";

&#x20;   int n = 3;

&#x20;   int first = n +(n-2);

&#x20;   int second =0;

&#x20;   int step=0;

&#x20;   StringBuilder sb = new StringBuilder();

&#x20;   for(int i =0 ;i<s.length();i++){

&#x20;       step=i+first;

&#x20;       for(int j =0 ; j<s.length();j++){

&#x20;           if(i==j){

&#x20;               sb.append(s.charAt(j));

&#x20;           }

&#x20;           else if(j==step){

&#x20;               sb.append(s.charAt(j));

&#x20;               j+=step;

&#x20;               first-=2;

&#x20;               if(second!=0){

&#x20;                   sb.append(s.charAt(j+second));

&#x20;                   j+=second;

&#x20;                   second +=2;

&#x20;               }



&#x20;           }

&#x20;           j--;

&#x20;       }



&#x20;   }

&#x20;   System.out.print(sb.toString());



&#x20;   }

}











Skillrack java track :



&#x20;  number formate :

&#x09;parseDatatype - wapperclass

&#x09;DecimalFormat- we can specify the decimal like this



String pattern = "#.##";

DecimalFormat formatter new DecimalFormat(pattern);



formatter.format(doubleval);



String pattern = "#.00";

if you put this then the zeros are like you put





How to change octal to integer and vise versa



Integer.intValue(the String value , which type (no of that for octal 8))







File Handling -> to store data permanently

\-> To use the data between different systems

\-> java.io.package



open

create

read

write

Close



I/O streams :



Byte Streams (Used for audio , video , image)



Input streams {



File input steams

Buffered Input



Output streams:

Fileoutput

Buffered output



}





Character streams (Text file){



Reader :



File Reader

Buffered Reader



Writer :

File writer

Buffered writer



}



this is File\_Name.createNewFile() use to create file





getName

canRead ()

delete()







455

771

1832

819







**SERIALIZATION :**



obj -> byte Streams(write object()) -> files





\-> converting object into bute streams and storing it in file / database to maintain the **state of object**

\-> platform independent

&#x20;how it store in the file

&#x09;\[Header]\[obj]

when we want to use this then we do the deserialization and than use it





this is in the package **java.io.package:**







&#x20;in the Serializable interface their is no var or methods it is just to tell that class is serializable







if(file.exists()){

&#x20;   file.delete();





**DESERIALIZATION :**

(converting)file -> byteStreams->object

&#x09;Using readObject() method







350

697

&#x09;     **TEST 3 :**

1.find the no of posible subarray that sum is divisible by k :

I/P =\[4,5,0,-2,-3,1]

O/P =7



2.find the longest  substring that at most contain the k distincit character



I/P = ecedf

O/P = 3



3.find the prefix substring that is same in the String array



I/P = \["flower" , "fly" , "fload" ]

O/P = "fl" ;





single threading 





Miltithreading :



&#x09;run multiple parts of the program at same time 



concurrency -> multiple task run at time base like first task 2s , second task 2s then again fist task like that 

(**switching between task)**; 

parallelism -> multiple process are run at same time (**different person do the different task at same time)**



process ->  is some program is run that is process ;

\->in process we cant able to share data b/w process easily 

\->creating process is cpu heavy 

thread -> is a smallest unit of process  that perform the task 

\->thread always belongs to task

\-> a multiple threads can exist inside one procces

in thread we can able to share data b/w threads 

