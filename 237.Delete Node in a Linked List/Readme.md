

开始对类的引用出现了误解，使用如下代码：
```java
    public void deleteNode(ListNode node) {
        	while(node != null){
        		node = node.next;
        	}    
    }
```
这样写的问题在于类变量都只是引用，修改了当前引用指向的对象，但是pre节点指向的对象并没有改变