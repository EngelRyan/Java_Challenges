# Friends

John will help his friend Joseph in a hard and laborious task, but they still not reach an agreement on the John’s payment by the aid in the task. After some discussion, John, who is very good at math, proposed the following: initially each one will deﬁne, without the other knowing it, a certain value, i.e. John will deﬁne a value n and Joseph will deﬁne a value m. So if Joseph propose do not to pay anything, then he will have to pay n + 1 dollars! If John say that do not want to receive anything and Joseph propose paying 1 or more dollars, Joseph will pay the same amount that would pay if John had asked for a dollar and Joseph had proposed to pay only m - 1 dollars! If both values are greater than zero, Joseph will pay the same value that would have to pay if he had proposed m - 1 dollars and John wanted to receive the same that would receive if Joseph had proposed to pay m dollars and he had asked for n - 1 dollars!! They also agreed that if Joseph was willing to pay at most 3 dollars, then John could charge up to 200 dollars. On the other hand, if Joseph was willing to pay 4 dollars, then John only could charge up to 2 dollars! After hours discussing these rules, they ﬁnally agreed that it would be too laborious calculate the amount owed by Joseph. So write a program that calculates the amount of dollars Joseph will have to pay to John, according to these rules.

### Input
The ﬁrst line of the input contains an integer T that indicates the number of test cases. The T following lines contain two integers m (0 ≤ m ≤ 4) and n (0 ≤ n ≤ 200), separated by a space, representing the values that Joseph want to pay and John want to receive, respectively.

### Output
The output should contain, for each test case, an integer equal to the value that Joseph will have to pay to John.

<table>
    <tr>
        <td>
        Input Sample
        </td>
        <td>	 
        Output Sample
        </td>
    </tr>
    <tr>
        <td>
        4<br>
        0 1<br>
        1 0<br>
        1 1<br>
        2 1 
        </td>
        <td>
        2<br>
        2<br>
        3<br>
        5
        </td>
    </tr>  
</table>

