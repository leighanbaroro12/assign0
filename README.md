# CMPUT 301: Lab 2 Participation Exercise

## Student Details
- **Full Name:** `Leighan Baroro`
- **CCID:** `1886935`

## References and Resources
- [remove | Core API – Kotlin Programming Language]
  LINK: https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-mutable-list/remove.html
  
- [Shape - Jetpack Compose Playground]
  LINK: https://foso.github.io/Jetpack-Compose-Playground/foundation/shape/

- [colour piccker - Google Search]
  LINK: https://www.google.com/search?q=colour+picker&sca_esv=35cfe427b01f9ce2&sxsrf=APpeQns1CryaTlKVqKR-yom_laokWlrrMg%3A1789063285436&source=hp&ei=dfCiaqGvGaip0PEPmojmqQU&iflsig=ABILxe8AAAAAaqL-hc1FGDMXNcmFfsnD2ykQvzEoFIDA&ved=0ahUKEwjhve6MzOSWAxWoFDQIHRqEOVUQ4dUDCB0&uact=5&oq=colour+picker&gs_lp=Egdnd3Mtd2l6Ig1jb2xvdXIgcGlja2VyMgoQABiABBiKBRhDMggQABiABBixAzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIKEAAYgAQYigUYQzIFEAAYgAQyBRAAGIAESJEQUABYsw5wAHgAkAEAmAFeoAG-CKoBAjEzuAEDyAEA-AEBmAINoAK8CcICDRAAGIAEGIoFGEMYsQPCAhYQLhiABBiKBRhDGLEDGIMBGMcBGNEDwgIQEAAYgAQYigUYQxixAxiDAZgDAJIHBDEwLjOgB_pGsgcEMTAuM7gHvAnCBwYyLTEyLjHIB1yACAE&sclient=gws-wiz

- [Working with modifiers | Kotlin Multiplatform Documentation]
  LINK: https://kotlinlang.org/docs/multiplatform/compose-layout-modifiers.html#custom-modifiers

- [Rgb  |  API reference  |  Android Developers]
  LINK: https://developer.android.com/reference/kotlin/androidx/compose/ui/graphics/colorspace/Rgb

- [android - Kotlin - How to change the background of Box with every LazyRow item - Stack Overflow]
  LINK: https://stackoverflow.com/questions/73921375/kotlin-how-to-change-the-background-of-box-with-every-lazyrow-item

- The following composable is from OpenAI, ChatGPT, "how would a compose function in kotlin use a callback for button", 2026-08-09
-  I used it to understand a general overview of how the callback would work and the process of it, I adapted it so that it could work well with my code I already had
  
@Composable
fun MyButton(onButtonClick: () -> Unit) {

    Button(
        onClick = {
            onButtonClick()
        }
    ) {
        Text("CLICK ME")
    }
}

@Composable
fun MyScreen() {

    MyButton(
        onButtonClick = {
            println("Button was clicked!")
        }
    )
}


## Verbal Collaboration
N/A. 
