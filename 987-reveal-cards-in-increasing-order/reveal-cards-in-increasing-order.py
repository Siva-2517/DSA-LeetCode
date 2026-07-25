from collections import deque
class Solution:
    def deckRevealedIncreasing(self, deck):
        deck.sort()
        n = len(deck)
        ans = [0] * n
        q = deque(range(n))
        for card in deck:
            ans[q.popleft()] = card
            if q:
                q.append(q.popleft())
        return ans