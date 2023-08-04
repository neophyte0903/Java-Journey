process=[]
arrivalTime=[]
burstTime=[]
completionTime=[]


for t in range(int(input("enter number of processes"))):
    process.append(input("name of process"))
    arrivalTime.append(int(input("enter arival time for the process")))
    burstTime.append(int(input("enter burst time")))
   

# print(process)
# print(arrivalTime)
# print(burstTime)
# print(completionTime)

#logic for completion time
'''
0-2 comp = arival+burst #2
p2 wait burst[i]+burst[i+1] #4
p3 buffer = arrival + burst #8
p4 wait burst[i]+burst[i+1] #12
'''



turnArroundTime=[]
waitingTime=[]
responseTime=[]

for j in range(len(process)):
    turnArroundTime.append(completionTime[j]-arrivalTime[j])

for i in range(len(process)):
    waitingTime.append(turnArroundTime[i]-burstTime[i])

for k in range(len(process)):
    responseTime.append(turnArroundTime[k])
    pass

