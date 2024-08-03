# Base Conversion

The Julian math teacher has marked a test whose content will be on converting between decimal, hexadecimal and binary numbers. For Julian, this kind of convertion is one of the most complex things to be done. Regardless of the time spent for studying these contents, he simple doesn't understand. So, as you understand about computing and being a friend of Julian, he asked for your help to make a program that checks if the conversions made ​​by him are correct.

### Input
The input contains many test cases. The first line of input contains an integer N indicating the number of test cases that follow, one by line. Each test case contains a number X (X > 0) followed by a Y text with three characters, indicating if the X number is in binary, decimal or hexadecimal. Regardless of the format, any of the numbers must fit into a 32-bit integer.

### Output
For each test case, Julian wants you to print the number of the test case followed by two lines, that contains the original number converted for each one of the other two bases. The sequence of the bases of output is always: decimal, hexadecimal (lowercase) and binary, ie must respect this order obviously excluding the input format.


Note: should print a blank line after each test case, even after the last test case.

<table>
  <tr>
    <td>Input Sample</td>
    <td>Output Sample</td>
  </tr>
  <tr>
    <td>3<br>101 bin<br>101 dec<br>8f hex</td>
    <td>
      <strong>Case 1:</strong><br>5 dec<br>5 hex<br><br>
      <strong>Case 2:</strong><br>65 hex<br>1100101 bin<br><br>
      <strong>Case 3:</strong><br>143 dec<br>10001111 bin
    </td>
  </tr>
</table>
