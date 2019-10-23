# Anko-Examples
Demonstrates basic usage of anko dsl for building layouts


### 001 Basic Example
Shows the most basic usage of anko dsl - just a linear layout with a textview and a button. When the button is clicked a handler is called in the activity.

### 002 Basic Example with Resource Strings
Basic example but some of the text is pulled from strings.xml with multiple languages supported (Afrikaans and Chinese)

If you add any examples please use the existing structures, e.g if you create 003 copy 002 and build on top of it.

### 003 Drawable Example
Using different drawable resource folders based on runtime config, exactly the same as with regular android

### 004 Alternative Layouts
Since we can't rely on resource folders for layouts because our layouts are in code, this example uses a simple workaround to switch config at runtime - a variable set in strings.xml in values and values-land.

When the app switches to landscape it reads a value of "landscape" from strings and createView switches to the landscape layout. 
