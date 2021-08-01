# Unit: CSS
## Lesson: What are IDs and Classes and how are they helpful when coding in HTML? 
* Time: one period (45mins)
* Grade: 9-12
* SWBAT:
  * describe what an ID and a Class is
  * distinguish the differences between IDs and Classes
  * use divs with IDs and Classes
  * make connections between the relationship between HTML and CSS
* Materials:
  * laptop
  * slideshow (HTMLCSSSampleLesson.pdf)
  * journal
  * starter code
  * have w3schools open as a resource
* Vocabulary:
  * HTML, CSS, div, ID, Class, selectors, color, font size, color picker, nested
* Prior knowlede: By now, students should have learned how to code headings, paragraphs, images, links, and be familiar with CSS, and the use of divs.

### Standards(NYSED Computer Science and Digital Fluency Learning Standards)
Computational Thinking
* Abstraction and Decomposition (9-12.CT.5)- understanding that the same abstract concept can be performed in different ways in a program
* Algorithms and Programming (9-12.CT.10)- importance of documenting the development
process
---

### Assessment:
Students will hand in completed HTML and CSS code. Will be graded based on completion. Participation points will also be given throughout the period.

### Differentiation:
Students will have their notes for reference, slideshow will have questions and snipets of code as the lesson progresses. Pauses and review of concepts at each step. Code will have comments on places where they should and should not edit. Stretch activity for students who are done early. W3schools as a reference.

---

## Flow of the period

### Do Now (10 mins)
Read over the starter code for today. See also a preview of the website. Take notes in the form of comments in the HTML: What are some things you know and don't know?

### Do now Review (5mins)

### Lesson(15 mins)
Classes and IDs are super powerful in HTML. Later when we review website frameworks using Bootstrap, we will look at some amazing built-in classes we can use in our websites. As we see in the code, classes and ids allow us to format different sections of code. They are otherwise known as selectors. We can call these in the CSS sheet and give them their own modifications (color, size, etc). Only the sections labeled with the respective classes and ids will be affected.

Pose question: What sections of the code will be affected by a class or id? Which are not? [For example, body is not affected!]

Pose question: What do we notice about classes? How many times are certain classes mentioned in the code? How many times are ids mentioned?

Classes can actually be reused throughout the code. If more than one section requires blue text, you can add that class to that element. As we see with the heading on line 13, we don't always need to use divs. Let's practice and add a class to line 37.

Live code(3 mins): Add class="red_text" in the div on line 37.

Review(1 min)

IDs on the other hand, can only be used once throughout the code. That is why we used the id for green_text in the heading and large in number 3. We don't want to use those modifications anywhere else.

Let's take a quick look at the CSS sheet. Notice how we call ids and classes differently! While elements have no symbols, classes use a period when called and ids use the pound/hashtag symbol.

Let's only edit div and see how that would affect the code. Do we see now why we would want to use an ID or Class?

## Student Activity (10 mins)
Let's edit our CSS sheet! Add the appropriate modifications for each section(text color and size).
Stretch- Finished early? Try looking up a color picker and instead of adding color as the name of the color, try adding them as HEX or RBG (use w3schools as a reference).

## Review activity (5mins)

### If we have time, or leave as Do Now for next day
- Check for understanding: Comment in your CSS sheet what an ID and Class are, and what symbols you use for them when calling them in the CSS sheet. How many times can you use an ID vs Class in your code?
---