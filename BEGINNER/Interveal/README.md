# Interval

You must make a program that read a float-point number and print a message saying in which of following intervals the number belongs: [0,25] (25,50], (50,75], (75,100]. If the read number is less than zero or greather than 100, the program must print the message “Fora de intervalo” that means "Out of Interval".

The symbol '(' represents greather than. For example:
[0,25] indicates numbers between 0 and 25.0000, including both.
(25,50] indicates numbers greather than 25 (25.00001) up to 50.0000000.

### Input
The input file contains a floating-point number.

### Output
The output must be a message like following example.

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
        25.01
        </td>
        <td>
        Intervalo (25,50]
        </td>
    </tr> 
    <tr>
        <td>   
        25.00
        </td>
        <td>
        Intervalo [0,25]
        </td>
    </tr>   
    <tr>
        <td>   
        100.00
        </td>
        <td>
        Intervalo (75,100]
        </td>
    </tr>    
    <tr>
        <td>   
-       25.02
        </td>
        <td>
        Fora de intervalo        
        </td>
    </tr>     
</table>