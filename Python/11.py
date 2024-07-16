class rec:
 def __init__(self, length, breadth):
    self.length = length
    self.breadth = breadth
 
 def area(self):
    print("Area of Rectangle: ", self.length*self.breadth)
length = float(input("Enter the length of the rectangle: "))
breadth = float(input("Enter the breadth of the rectangle: "))
r1 = rec(length, breadth)
r1.area()
