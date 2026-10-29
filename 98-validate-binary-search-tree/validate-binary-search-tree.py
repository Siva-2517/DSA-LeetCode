# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: TreeNode | None) -> bool:
         return self.validate(root,float('-inf'),float('inf'))

    def validate(self,root,minx,maxx)-> bool:
        if root is None:
            return True
        if root.val<=minx or root.val>=maxx:
            return False
        return self.validate(root.left,minx,root.val) and self.validate(root.right,root.val,maxx)

