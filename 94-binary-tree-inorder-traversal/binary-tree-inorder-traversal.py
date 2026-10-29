# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
   
    def inst(self,root,res):
        if root is None:
            return
        self.inst(root.left,res)
        res.append(root.val)
        self.inst(root.right,res)

    def inorderTraversal(self, root: TreeNode | None) -> list[int]:
        res=[]
        self.inst(root,res) 
        return res