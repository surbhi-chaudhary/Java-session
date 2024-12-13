## Homework Assignment

### 1. Synchronization Task

**Problem:** Implement a class `Account` with a method `transfer` that transfers a given amount of money from one account to another. Both accounts should start with an initial balance. Ensure that the transfer process is thread-safe.

### 2. wait(), notify(), and notifyAll() Task

**Problem:** Implement a `ProducerConsumer` pattern where the `Producer` thread produces data into a shared `Queue`, and the `Consumer` thread consumes data from this queue. Use `wait()` and `notify()` to handle the producer-consumer coordination.

### 3. Thread Pools Task

**Problem:** Create a thread pool with a fixed number of threads. Submit 20 tasks to this pool where each task simply prints the current thread's name and the task number.

### 4. Concurrent Collections Task

**Problem:** Demonstrate the use of `ConcurrentHashMap` by creating a shared instance among multiple threads where each thread adds ten entries to the map and prints the map size at the end.

### 5. Locks and ReentrantLock Task

**Problem:** Use `ReentrantLock` to create a thread-safe counter that increments and prints its value for each thread.

### 6. Real World Problem

**Problem:** 
We want to build a word count for all the alphabet characters starting from a-z(lowercase). 
- The source URL is https://www.rfc-editor.org/rfc/
- We want to extract for 100 RFC's, You can fetch the respective RFC based on the index, For example
  - https://www.rfc-editor.org/rfc/rfc1.txt
  - https://www.rfc-editor.org/rfc/rfc2.txt
  - https://www.rfc-editor.org/rfc/rfc3.txt
  - .
  - .
  - .
  - https://www.rfc-editor.org/rfc/rfc100.txt


- We need to fetch this text file from the above URL and count the alphabet characters
- At-last we want the aggregated alphabet count which inclusive of all the 100 RFC's 

**Scoring:**
- Correctness
- Speed
- Best Practices and Readability

**Hints:**
- Use Java [HttpClient](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/package-summary.html) for fetching the RFC file from the above URL
- Use Java lightweight thread to process in parallel





