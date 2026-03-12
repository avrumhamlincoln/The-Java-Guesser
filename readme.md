#menu
```
print all of the options
take input of choice
run choice
```

#human guesser
```
generate a number 1-100 and set it to correct
ask user to enter a number

keepGoing = True

while keepGoing:
    if guess > correct:
        say "too high"
        tries += 1
    elif guess < correct:
        say "too low"
        tries += 1
    else:
        if tries < 7:
            say "very good ;)"
        elif tries = 7:
            say "average :/"
        else:
            say "you didn't do so good :["

        keepGoing = False 
```

#computer guesser
```
say "pick a number 1 - 100"

low = 1
high = 100
tries = 0
guess = 0
keepGoing = True

while keepGoing:
    guess = (low + high) / 2
    ask user if higher, lower, or correct

    if higher:
        low = guess + 1
    if lower:
        high = guess - 1
    if correct:
        say "I got it right!!!"
        keepGoing = False
```
