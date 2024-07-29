# Digits Count

Diana is going to write a list of all positive integers between A and B, inclusive, in base 10 and without any leading zeros. She wants to know how many times each digit is going to be used.

### Input
Each test case is given in a single line that contains two integers A and B (1 ≤ A ≤ B ≤ 108). The last test case is followed by a line containing two zeros.

### Output
For each test case print a single line with 10 integers representing the number of times each digit is used when writing all integers between A and B, inclusive, in base 10 and without leading zeros. Write the counter for each digit in increasing order from 0 to 9.

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
        1 9<br>
        12 321<br>
        5987 6123<br>
        12345678 12345679<br>
        0 0
        </td>
        <td>
        0 1 1 1 1 1 1 1 1 1<br>
        61 169 163 83 61 61 61 61 61 61<br>
        134 58 28 24 23 36 147 24 27 47<br>
        0 2 2 2 2 2 2 2 1 1
        </td>
    </tr>
</table>