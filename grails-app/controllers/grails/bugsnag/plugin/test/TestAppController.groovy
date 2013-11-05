package grails.bugsnag.plugin.test

class TestAppController {

    def bugsnagService

    def index() {
      throw new RuntimeException('testing uncaught exception')
    }

    def caughtExceptionWithCustomReport(){
      try{
        throw new RuntimeException('testing caught exception with custom report')
      }
      catch( excp ){
        bugsnagService.notify( request, excp, [data1:'testing data1',data2: 'testing data2'] ) 
      }

      render text: "caughtExceptionWithCusomReport"
    }

    def caughtException(){
      try{
        throw new RuntimeException('testing caught exception with custom report')
      }
      catch( excp ){
        bugsnagService.notify(request,excp) 
      }

      render text: "caughtException"
    }
}
