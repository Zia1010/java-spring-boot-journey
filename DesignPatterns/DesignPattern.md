# Java Design Patterns - Quick Guide

## What is a Design Pattern?

**Design Pattern** = Reusable solution to a common problem in software design
- Blueprint for solving recurring design problems
- Best practices proven effective over time
- Language-independent but implemented differently per language
- Improves code maintainability, scalability, and reusability

---

## Design Patterns Categories (3 Types, 23 Total)

### **1. CREATIONAL PATTERNS** (5 patterns)
*Control object creation mechanism*

#### **1.1 Singleton**
- **Purpose:** Ensure only ONE instance of a class exists
- **When:** Global shared resource, configuration manager, connection pool
- **Practice:** Design a logger class that logs to a single file - multiple parts of code write to same logger instance
- **Where:** Database connections, logging, application configuration, thread pools

#### **1.2 Factory Method**
- **Purpose:** Create objects WITHOUT specifying their concrete classes
- **When:** Object creation logic is complex or depends on runtime conditions
- **Practice:** Design a payment system - user selects payment method (credit card, PayPal, Bitcoin) but the correct payment processor is created automatically
- **Where:** Object factory based on type parameter, multiple implementations of same interface

#### **1.3 Abstract Factory**
- **Purpose:** Create families of RELATED objects together
- **When:** Need to create objects that work together (consistency)
- **Practice:** Design a UI theme system - when user selects "Dark Mode", create dark buttons, dark panels, dark menus TOGETHER (not mixing dark button with light panel)
- **Where:** UI frameworks, database abstractions, operating system components

#### **1.4 Builder**
- **Purpose:** Construct complex objects step-by-step
- **When:** Object has many optional parameters or complex initialization
- **Practice:** Design a pizza order form - customer adds toppings one by one (cheese, pepperoni, onions, etc.) then builds the complete pizza
- **Where:** Complex object construction (Person with name, age, email, phone, address, etc.), HTTP requests, SQL queries

#### **1.5 Prototype**
- **Purpose:** Create new objects by cloning existing ones
- **When:** Object creation is expensive or complex
- **Practice:** Design a document template system - instead of creating blank document from scratch, clone existing template (resume template, letter template) and modify it
- **Where:** Document cloning, object copying, template systems

---

### **2. STRUCTURAL PATTERNS** (7 patterns)
*Compose objects into larger structures*

#### **2.1 Adapter**
- **Purpose:** Make incompatible interfaces work together
- **When:** Need to use existing class with incompatible interface
- **Practice:** You have old USB device but new computer only has USB-C - use adapter to make them compatible
- **Where:** Legacy system integration, third-party library adaptation, interface translation

#### **2.2 Bridge**
- **Purpose:** Separate abstraction from implementation (DECOUPLE)
- **When:** Abstraction and implementation vary independently
- **Practice:** Design a remote control for TV - the remote (abstraction) works with Sony TV, Samsung TV, LG TV (different implementations) independently
- **Where:** Abstract APIs, shape rendering (different graphics systems), device drivers

#### **2.3 Composite**
- **Purpose:** Treat individual objects and compositions uniformly
- **When:** Tree structures of objects (part-whole hierarchies)
- **Practice:** Design file system - folder contains files and subfolders; when you delete folder, delete all files and subfolders inside recursively
- **Where:** File systems, GUI components, organizational hierarchy, menu structures

#### **2.4 Decorator**
- **Purpose:** Add behavior to objects dynamically WITHOUT modifying original class
- **When:** Need to add responsibilities to objects at runtime
- **Practice:** Design a coffee shop ordering system - customer orders coffee (base), then adds decorations: extra shot, whipped cream, caramel drizzle (each adds cost/behavior)
- **Where:** Stream wrappers, UI decorators, feature additions without subclassing

#### **2.5 Facade**
- **Purpose:** Provide simplified interface to complex subsystem
- **When:** Complex system has many classes/interfaces
- **Practice:** Design a home automation system - from app, user presses "Movie Mode" which behind scenes turns off lights, closes curtains, adjusts temperature (complex coordination becomes ONE button)
- **Where:** Framework abstractions, system setup wizards, library wrappers

#### **2.6 Flyweight**
- **Purpose:** Share common data between objects to reduce memory
- **When:** Need to create MANY similar objects
- **Practice:** Design a chess game with 8 billion boards created - instead of storing piece image (100KB) in each board, store image ONCE and 8 billion boards reference it
- **Where:** Game character textures, font rendering, connection pooling

#### **2.7 Proxy**
- **Purpose:** Provide placeholder/surrogate for another object
- **When:** Need to delay expensive operations or control access
- **Practice:** Design a document viewer - load only thumbnail first (fast), real document image loads on demand when user clicks
- **Where:** Lazy loading, access control, caching, remote object access

---

### **3. BEHAVIORAL PATTERNS** (11 patterns)
*Define communication between objects*

#### **3.1 Observer**
- **Purpose:** Notify multiple objects when one object's state changes
- **When:** Objects need to be notified of state changes (publish-subscribe)
- **Practice:** Design a stock ticker app - when stock price changes, notify ALL users watching that stock automatically
- **Where:** Event handling, pub-sub systems, reactive programming, model-view updates

#### **3.2 Strategy**
- **Purpose:** Define family of algorithms and switch between them at runtime
- **When:** Multiple ways to do something, choice at runtime
- **Practice:** Design a sorting service - customer can choose sort algorithm (quick sort, merge sort, bubble sort) and system automatically uses selected one
- **Where:** Sorting/searching algorithms, payment methods, compression algorithms, travel routing

#### **3.3 Command**
- **Purpose:** Encapsulate request as object
- **When:** Need to parametrize objects with operations, undo/redo, queuing
- **Practice:** Design a text editor - each action (cut, copy, paste, undo) becomes a command object that can be stored, replayed, or undone
- **Where:** Undo/redo functionality, transaction systems, macro recording

#### **3.4 State**
- **Purpose:** Alter object behavior when its state changes
- **When:** Object behaves differently based on internal state
- **Practice:** Design a traffic light - red state stops cars, yellow state warns, green state allows; behavior changes when state changes
- **Where:** Workflow states, order processing, network connection states, game character states

#### **3.5 Template Method**
- **Purpose:** Define skeleton of algorithm in base class, let subclasses fill details
- **When:** Multiple algorithms share same structure
- **Practice:** Design cooking recipes - all recipes follow: prepare ingredients, cook, plate; subclasses just implement details
- **Where:** Framework templates, algorithm skeletons, process flows

#### **3.6 Visitor**
- **Purpose:** Add new operations to object WITHOUT changing object class
- **When:** Need multiple operations on complex object structure
- **Practice:** Design a tax calculator for different document types - document doesn't know about tax, visitor calculates tax based on document type
- **Where:** Compilers, report generators, tree traversal, document processing

#### **3.7 Chain of Responsibility**
- **Purpose:** Pass request along chain of handlers until one processes it
- **When:** Multiple handlers, sender doesn't know who will handle request
- **Practice:** Design customer support system - customer complaint goes to: support agent → supervisor → manager → CEO (each level tries, passes to next if can't handle)
- **Where:** Logging frameworks, event handling, approval workflows, exception handling

#### **3.8 Mediator**
- **Purpose:** Define object to encapsulate how objects interact
- **When:** Multiple objects communicate in complex ways
- **Practice:** Design a chat room - users send messages to chat room (mediator) which broadcasts to all users; users don't communicate directly
- **Where:** Chat systems, dialog windows, air traffic control, game turn management

#### **3.9 Memento**
- **Purpose:** Capture and restore object's internal state
- **When:** Need save/restore functionality
- **Practice:** Design a game checkpoint system - save player position, health, inventory at checkpoint; restore exactly when player dies
- **Where:** Undo/redo, save games, transaction rollback, snapshots

#### **3.10 Iterator**
- **Purpose:** Access elements of collection sequentially without exposing structure
- **When:** Need uniform way to traverse different collection types
- **Practice:** Design a library catalog viewer - whether books stored in list, array, tree, user sees same interface: next(), previous(), hasMore()
- **Where:** Collection frameworks, list/array traversal, cursor movement

#### **3.11 Interpreter**
- **Purpose:** Define language grammar and interpreter for it
- **When:** Need to interpret domain-specific language
- **Practice:** Design a calculator app that interprets: "2 + 3 * 4" into correct AST and evaluates
- **Where:** SQL parsing, mathematical expression evaluation, DSL interpretation

---

## Quick Reference Table

| Pattern | Category | Purpose | Use When |
|---------|----------|---------|----------|
| **Singleton** | Creational | One instance only | Global shared resource |
| **Factory** | Creational | Create via interface | Runtime type selection |
| **Abstract Factory** | Creational | Related objects family | Consistent group creation |
| **Builder** | Creational | Step-by-step building | Complex object construction |
| **Prototype** | Creational | Clone existing object | Expensive creation |
| **Adapter** | Structural | Incompatible interfaces | Legacy integration |
| **Bridge** | Structural | Decouple abstraction/impl | Independent variation |
| **Composite** | Structural | Tree structures | Part-whole hierarchy |
| **Decorator** | Structural | Add behavior dynamically | Runtime feature addition |
| **Facade** | Structural | Simplify complex system | Subsystem abstraction |
| **Flyweight** | Structural | Share common data | Many similar objects |
| **Proxy** | Structural | Placeholder/surrogate | Lazy load/access control |
| **Observer** | Behavioral | Notify on state change | Pub-sub, event handling |
| **Strategy** | Behavioral | Switchable algorithms | Runtime algorithm selection |
| **Command** | Behavioral | Encapsulate request | Undo/redo, queuing |
| **State** | Behavioral | Behavior by state | State-dependent behavior |
| **Template Method** | Behavioral | Algorithm skeleton | Algorithm structure |
| **Visitor** | Behavioral | Add operations | New ops without class change |
| **Chain** | Behavioral | Handler chain | Sequential request handling |
| **Mediator** | Behavioral | Encapsulate interaction | Complex object communication |
| **Memento** | Behavioral | Capture/restore state | Save/restore functionality |
| **Iterator** | Behavioral | Sequential access | Collection traversal |
| **Interpreter** | Behavioral | Parse grammar | Language interpretation |

---

## Most Used Patterns in Enterprise Java

**Rank 1-5 (Use Daily):**
1. **Singleton** - everywhere (logger, config, DB connection)
2. **Factory** - Spring beans, object creation
3. **Observer** - event handling, Spring events
4. **Strategy** - algorithm selection, payment methods
5. **Decorator** - Stream I/O, Spring aspects

**Rank 6-10 (Use Weekly):**
6. **Builder** - complex DTOs, HTTP requests
7. **Facade** - library wrappers, system abstraction
8. **Adapter** - third-party integration
9. **Command** - undo/redo, transaction systems
10. **Composite** - tree structures, menus

---

## Anti-Patterns to AVOID

❌ **Don't overuse patterns** - simple problem = simple solution  
❌ **Don't use pattern just because it exists** - understand WHEN first  
❌ **Don't mix patterns unnecessarily** - causes over-engineering  
❌ **Don't ignore alternatives** - a simple class might be better than a pattern

---

## How to Choose Right Pattern

**Ask yourself:**

1. **What problem am I solving?**
    - Object creation → Creational
    - Object composition → Structural
    - Object communication → Behavioral

2. **Is this a common problem?**
    - If yes → Check design patterns list
    - If no → Maybe don't use pattern

3. **Does pattern simplify or complicate?**
    - Simpler → Use it
    - More complex → Don't use it

4. **Will I need this flexibility later?**
    - If yes → Pattern is justified
    - If no → YAGNI (You Ain't Gonna Need It)

---

## Practice Assignments (No Code - Statement Only)

### Level 1: Identify the Pattern
1. Design a document editor with unlimited undo/redo - which pattern?
2. Design a notification system notifying 1000 users when order ships - which pattern?
3. Design payment system accepting credit card, PayPal, crypto - which pattern?

### Level 2: Design Scenario
4. Design a game where character has states (standing, running, jumping) with different behaviors - which pattern and why?
5. Design a database connection pool that creates connections as needed - which pattern?
6. Design a UI where button appearance changes (dark/light theme) consistently - which pattern?

### Level 3: Real World
7. Design a restaurant order system where orders go through: Chef → Manager → Owner for approval - which pattern?
8. Design a large multiplayer game with millions of weapons, each displayed as 3D model - memory optimization pattern?
9. Design library where system can read books (PDF, EPUB, Audiobook) through same interface - which pattern?

---

## Key Takeaways

✅ **23 design patterns** solve common problems  
✅ **Know 5-7 patterns well** - that covers 80% of cases  
✅ **Understand WHEN to use** - more important than HOW to code  
✅ **Patterns enable flexibility** - for future requirements  
✅ **Don't force patterns** - if simple solution works, use it  
✅ **Patterns are tools** - not laws, use when it makes sense

---

## Next Learning Path

**After understanding patterns:**
- **Week 1-2:** Singleton, Factory, Builder (creational)
- **Week 3-4:** Adapter, Facade, Decorator (structural)
- **Week 5-6:** Observer, Strategy, Command (behavioral)
- **Week 7-8:** Advanced patterns + real-world applications

---

*Remember: A design pattern is not about code complexity - it's about solving common design problems elegantly.*
