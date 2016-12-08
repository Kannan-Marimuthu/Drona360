<html lang="en" >
   <head>
      <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-aria.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-messages.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angular_material/1.0.0/angular-material.min.js"></script>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
      <script language="javascript">
         angular
            .module('firstApplication', ['ngMaterial'])
            .controller('cardController', cardController);

         function cardController ($scope) {            
         }  
      </script>      
   </head>
   <body ng-app="firstApplication">  
   <div flex-xs flex-gt-xs="25" layout="column">
     <md-card md-theme="{{ showDarkTheme ? 'dark-purple' : 'default' }}" md-theme-watch>
        <md-card-title>
          <md-card-title-text>
            <span class="md-headline">Card with image</span>
            <span class="md-subhead">Small</span>
          </md-card-title-text>
          <md-card-title-media>
            <div class="md-media-sm card-media"></div>
          </md-card-title-media>
        </md-card-title>
        <md-card-actions layout="row" layout-align="end center">
          <md-button>Action 1</md-button>
          <md-button>Action 2</md-button>
        </md-card-actions>
      </md-card>
	   <md-card md-theme="{{ showDarkTheme ? 'dark-purple' : 'default' }}" md-theme-watch>
        <md-card-title>
          <md-card-title-text>
            <span class="md-headline">Card with image</span>
            <span class="md-subhead">Small</span>
          </md-card-title-text>
          <md-card-title-media>
            <div class="md-media-sm card-media"></div>
          </md-card-title-media>
        </md-card-title>
        <md-card-actions layout="row" layout-align="end center">
          <md-button>Action 1</md-button>
          <md-button>Action 2</md-button>
        </md-card-actions>
      </md-card>
	   <md-card md-theme="{{ showDarkTheme ? 'dark-purple' : 'default' }}" md-theme-watch>
        <md-card-title>
          <md-card-title-text>
            <span class="md-headline">Card with image</span>
            <span class="md-subhead">Small</span>
          </md-card-title-text>
          <md-card-title-media>
            <div class="md-media-sm card-media"></div>
          </md-card-title-media>
        </md-card-title>
        <md-card-actions layout="row" layout-align="end center">
          <md-button>Action 1</md-button>
          <md-button>Action 2</md-button>
        </md-card-actions>
      </md-card>
	  
      <md-card>
         <img ng-src="${pageContext.request.contextPath}/static/img/school.png" class="md-card-image" alt="Learn HTML5">
         <md-card-header>
            <md-card-avatar>
               <img class="md-user-avatar" src="${pageContext.request.contextPath}/static/img/school.png">
            </md-card-avatar>
            <md-card-header-text>
               <span class="md-title">HTML5</span>
               <span class="md-subhead">Learn HTML5 @TutorialsPoint.com</span>
            </md-card-header-text>
         </md-card-header>
         <md-card-title>
            <md-card-title-text>
               <span class="md-headline">HTML5</span>
            </md-card-title-text>
         </md-card-title>
         <md-card-actions layout="row" layout-align="start center">
            <md-button>Download</md-button>
            <md-button>Start</md-button>
            <md-card-icon-actions>
               <md-button class="md-icon-button" aria-label="icon">
                  <md-icon class="material-icons">add</md-icon>
               </md-button>
            </md-card-icon-actions>
         </md-card-actions>
         <md-card-content>
            <p>HTML5 is the next major revision of the HTML standard superseding HTML 4.01, XHTML 1.0, and XHTML 1.1. HTML5 is a standard for structuring and presenting content on the World Wide Web.</p>
            <p>HTML5 is a cooperation between the World Wide Web Consortium (W3C) and the Web Hypertext Application Technology Working Group (WHATWG).</p>
            </p>The new standard incorporates features like video playback and drag-and-drop that have been previously dependent on third-party browser plug-ins such as Adobe Flash, Microsoft Silverlight, and Google Gears.</p>
         </md-card-content>
      </md-card>
	  <div>
   </body>
</html>