# This creates a function and stores it in a variable.
# It takes in an argument, the name of the Scout
t255favorite <- function(name) {
  
  # Create a vector of activities for T255 and store it in a variable
  # The 'c' method combines values into a vector or list
  activities <- c("camping", "hiking", "canoeing", "high adventure", "rock climbing", 
                  "caving", "biking", "community service")
  
  # Store the length of the activities vector in another variable
  activities_count <- length(activities)
  
  # Create a new variable to store the user's response and 
  # Set the default value to "n"
  answer <- "n"

  # Loop until the user answers 'y' to the question if this is his/her
  # favorite activity
  while(answer == "n") {
    # Get a random number between 1 and the length of the activities
    # variable and store it in a new variable
    random_activity <- sample(1:activities_count, 1)

    # Get the name of the activity from the activities variable that
    # is stored in the location/index of the random number we just generated
    favorite_activity <- activities[random_activity]

    # Ask the user is this is his/her favorite activity and store the response
    # back in the answer variable. If answer == anything but n the it will break
    # out of the while loop
    answer <- readline(prompt = paste("\nIs", favorite_activity, 
                                      "your favorite Troop 255 activity", name, "? (y/n)  "))
  }
  
  # Print a message saying that it is the program's favorite activity too
  print(paste("Well, ", name, ", ", favorite_activity, " is my favorite activity too!", sep=""))
}

# Ask the user his/her name and store it in the my_name variable
my_name <- readline(prompt="\nWhat is your name, Scout? ")

# Call the funtion and pass the user's name in as an argument
t255favorite(my_name)

# Suggestions to change
# 1. Add or change the activities in the vector
# 2. Print out the values in some of the variables in the function to see what they are
# 3. Change the while loop to check that the value does not equal y
# 4. Change so that two activities are selected and ask the user if they like both (advanced)