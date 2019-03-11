# coding=utf-8
# BFS: breadth-first search，广度优先搜索
# O(V+E) V顶点数 E边数

from collections import deque

# 图用散列表表示
graph={}
graph["you"]=["alice", "bob", "claire"]
graph["bob"]=["anuj", "peggy"]
graph["alice"]=["peggy"]
graph["claire"]=["thom","jonny"]
graph["anuj"]=[]
graph["peggy"]=[]
graph["thom"]=[]
graph["jonny"]=[]


def search(name):
    search_queue = deque() # 双端队列
    search_queue += graph["you"]
    searched = [] # 记录已经检查过的人

    while search_queue:
        person = search_queue.popleft()
        if person not in searched:
            if person_is_seller(person):
                print person + " is a seller!"
                return True
            else:
                search_queue += graph[person]
                searched.append(person)
    return False;

def person_is_seller(name):
    return name[-1] == 'm'

search("you")
