class BootStrap {

    def bugsnagService

    def init = { servletContext ->
      bugsnagService.addMetadata = { metaData ->
        metaData.addToTab( "testtab", "test", "added metadata!!!!" )
      }
    }
    def destroy = {
    }
}
