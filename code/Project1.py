# Initialize looping variable, assume 'yes' as the first answer
# A variable is a reserved memory location on the computer to store values
# In other words, a variable in a program gives data to the computer for processing.
# This is a variable of type string
sContinueYN = "y"
 
# The while loop is used to iterate over a block of code as long as 
# the test expression (condition) is true. We generally use while loop
# when we don't know the number of times to iterate beforehand.
while sContinueYN == "y": # <--- Test experssion

    # Get temperature input from the user. The user will be prompted with the text
    # below. Once the user presses enter, the text will be stored in the sDegreeF
    # variable, which is a string.
    # What does the '\t' at the end of the text do?
    sDegreeF = input("Enter a temperature in degrees Farenheight (F):\t")

    # Convert text entry to number value (integer) that can be used in equations
    # And store that in a new variable.
    nDegreeF = int(sDegreeF)

    # Convert temperature from F to Celsius and store that in a new variable
    nDegreeC = (nDegreeF - 32) * 5 / 9

    # Print the result to the screen
    print ("\nTemperature in degrees C is:", nDegreeC)

    # Check for temperature below freezing and print a cute message
    if nDegreeC < 0:
        print ("Pack long underwear!\n")

    # Check for it being a hot day and print a cute message
    if nDegreeF > 100:
        print ("Remember to hydrate!\n")

    # Ask the user if they want to convert another temperature
    sContinueYN = input("Convert another temperature?\t")
 
# Exit the program

'''
Ideas to expand the program:
1. Change the messages to have different advice for extreme temperatures.
2. Change the message to show the temperature in F and C, i.e. 'The temperature 104 F is 40.0 C'
3. Add another temperature trigger check for very extreme temps.
4. Collect the person’s name before the loop starts (store in a variable) and add this to the output messages.
5. Check for Y or Yes or yes in addition to checking for just y
6. Change to allow for numbers other than integers
7. Add option to change from F to C or C to F (advanced)
'''