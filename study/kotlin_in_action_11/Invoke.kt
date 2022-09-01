package com.example.kotlin.kotlin_in_action_11

fun main() {
    val greeter = Greeter("반갑습니다")
    greeter("진원")

    val i1 = Issue("IDEA-12345", "IDEA", "Bug", "Major", "환경 설정 저장 실패")
    val i2 = Issue("KT-12345", "Kotlin", "Feature", "Normal", "평범한 이슈")

    val predicate = ImportantIssuesPredicate("IDEA")

    for (issue in listOf(i1, i2).filter(predicate)) {
        println(issue.id)
    }
}

class Greeter(private val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name")
    }
}

data class Issue(
    val id: String, val project: String, val type: String,
    val priority: String, val description: String
)

class ImportantIssuesPredicate(private val project: String) : (Issue) -> Boolean {
    override fun invoke(issue: Issue): Boolean {
        return issue.project == project && issue.isImportant()
    }

    private fun Issue.isImportant(): Boolean {
        return type == "Bug" && (priority == "Major" || priority == "Critical")
    }
}