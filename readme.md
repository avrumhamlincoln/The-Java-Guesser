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

while keepGoing:
    if guess > correct:
        say "too high"
        tries += 1
    elif guess < correct:
        say "too low"
        tries += 1
    else:
        say "you got it right in <tries> tries"
        
