def forl():
  print("You have chosen a for loop\n")
  a = input("Create an a value thats less that 10 and it will print out that amount: \n")
  for a in range(10):
    print('Value of a: ' + a)


def dowhilel():
  print("While Python doesn't have a do while loop, you can reiterate a \n")
  print("You have chosen a for loop\n")
  x = input("Create an x value thats less that 10 and it will print out that amount: \n")
  print(x)
  while x < 10:
    print(x)


def whilel():
  print("You have chosen a while loop\n")
  print("Create an i value thats less that 10 and it will print out that amount\n")
  i = input()
  while i < 10:
    print("Value of i: " + i)
    i += 1


print ("Do you want to do a \nFor loop, type 1\nWhile loop, type 2\nWhile loop, type 3\n")

g = input()

if g == 1:
  print ("hi")
  print(forl())
  forl()
if g == 2:
  dowhilel()
if g == 3:
  whilel()
