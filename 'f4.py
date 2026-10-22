import sys
def main():
  input_data = input().split()
  if len(input_data) <2:
    return
  a = float(input_data[0])
  b = float(input_data[1])
  if a ==0:
    if b == 0:
      print(1)
    else:
      print(0)
  else:
    if a * b >0:
      print(1)
    else:
      print(0)
if __name__ == '__main__':
  main()
