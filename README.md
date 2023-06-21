# jenkins-shared-library
A collection of Groovy scripts shared between different Jenkins jobs.

## Setup
1. In Jenkins, go to Manage > Configure System
1. Scroll down to the Global Pipelines Libraries section
1. For "Name", enter `jenkins-shared-library`
1. For "Default Version", enter `main`
1. For "Retrieval method", select "Modern SCM"
1. For "Source Code Management", select "GitHub"
1. For "Credentials", select your [previously saved] git credentials
1. For "Repository HTTPS URL", enter `https://github.com/kirbycope/jenkins-shared-library.git`
1. For "Library Path", enter `./`

## Utilization
1. Add a reference to the top of your jenkins file(s)
    - `@Library("jenkins-shared-library")`
