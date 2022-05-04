@Library(['Richemont@CCP']) _


ccpBuildQATesting(
        nodeJS: "NodeJS-14.19.0",
        proxy: "",
        recipients: ["helene.christin@richemont.com","ouafae.kamili@richemont.com","sara.elasraoui@richemont.com","mohamed.boutamart@richemont.com","silvio.loniglio@richemont.com","sylvain.dembski@richemont.com"],
        numberDayArchivedReports: 7,
        defaultTestingEnvironment: "preprod"
)
