list2D = [[1,2],[4,5]]
max = list2D[0][0]
min = list2D[0][0]
for i in range(len(list2D)):
    for j in range(len(list2D[i])):
        if list2D[i][j] > max:
            max = list2D[i][j]
        if list2D[i][j] < min:
            min = list2D[i][j]

print(max)
print(min)