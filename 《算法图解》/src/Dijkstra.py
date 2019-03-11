# coding=utf-8
# 狄克斯拉特算法 Dijkstra's algorithm，加权图
# 只适用于有向无环图
# 不能用于包含负权边的图

graph = {}

graph["start"]={}
graph["start"]["a"]=6 # 起点到 a 点的距离是6
graph["start"]["b"]=2

graph["a"]={}
graph["a"]["final"]=1 # a 点到终点的距离是 1

graph["b"]={}
graph["b"]["a"]=3
graph["b"]["final"]=5

graph["final"]={} # 终点没有任何邻居

# 开销表，起点到各个点的距离，非直接相连的直接标无穷大
costs={}
costs["a"]=6
costs["b"]=2
costs["final"]=99999999 # 无穷大

# 当前开销路径，父节点是哪个
parents={}
parents["a"]="start"
parents["b"]="start"
parents["final"]=None

# 已经处理的节点
processed=[]

def find_lowest_cost_node(costs):
    lowest_cost = 99999999
    lowest_cost_node = None
    for node in costs:
        cost = costs[node]
        if cost < lowest_cost and node not in processed:
            lowest_cost = cost
            lowest_cost_node = node
    print "当前开销最小的节点为" + str(lowest_cost_node)
    return lowest_cost_node

node = find_lowest_cost_node(costs)
while node is not None:
    cost = costs[node]
    neighbors = graph[node]
    for n in neighbors.keys(): # 遍历当前节点的所有邻居
        new_cost = cost + neighbors[n]
        if costs[n] > new_cost: # 如果经当前节点前往该邻居更近
            costs[n] = new_cost # 就更新该邻居的开销
            print "更新" + n + "节点的开销为" + str(new_cost)
            parents[n] = node # 同时将该邻居的父节点设置为当前节点
            print "设置" + n + "节点的父节点为" + node
    processed.append(node) # 将当前节点标记为处理过
    print node + "节点处理完成"
    node = find_lowest_cost_node(costs)

