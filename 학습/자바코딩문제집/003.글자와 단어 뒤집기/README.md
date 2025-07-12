# 글자와 단어 뒤집기 </br>
+ 각 단어의 글자를 뒤집는 프로그램과 각 단어의 글자와 각 단어를 뒤집는 프로그램을 작성하라


# 풀이 </br>
+ 문제에서는 각 단어의 글자를 뒤집는 것 하나와 뒤집은 글자에 이어 단어를 뒤집는 </br> 총 두 개의 프로그램을 작성하라 하였다.
+ 하나의 기능을 만들고 메서드로 따로 구분해도 되지만 출력문을 두 번 호출 하기로 하였다.
+ 입력을 받은 글자 단위를 iter로 입력 받는다.
+ 각 글자들을 역순으로 StringBuilder에 추가한다. 
+ 각 단어들을 Collections.reverse()를 사용하여 뒤집는다.


#시간 복잡도
 ```java
        for(String str : br.readLine().split(" ")){
            StringBuilder sb = new StringBuilder();

            for (int i = str.length() - 1; 0 <= i; i--) {
                sb.append(str.charAt(i));
            }
            strArray.add(sb.toString());
        }
```
---
+ 입력 받은 문장을 단어로 구분하기 위해 iter 사용하고 각 단어의 길이만큼 for문을 돌렸기에 </br> O(N * M)으로 생각한다 왜냐하면 단어의 개수와 단어의 길이는 다르기 때문이다.
+ ArrayList에 추가 작업은 끝에 데이터 삽입이므로 O(1), String Builder O(1) or O(n)
+ Collections.reverse()는 ArrayList에 원소를 뒤집기 때문에 원소의 개수 만큼 O(n)
+ 결론적으로 O(N * M)의 시간이라 생각 한다.