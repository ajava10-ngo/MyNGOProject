<%-- 
    Document   : createEvent
    Created on : 5 Nov, 2019, 8:58:29 PM
    Author     : Ritesh Verma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create Event</title>
    
  </head>
  <body>
    <div class="body-wrapper">
      <jsp:include page="blocks/nav.jsp"></jsp:include>
      <jsp:include page="blocks/header.jsp"></jsp:include>
          <!--content-->
          <div class="page-wrapper mdc-toolbar-fixed-adjust">
            <main class="content-wrapper">
              <div class="mdc-layout-grid">
                <div class="mdc-layout-grid__inner">
                  <div class="mdc-layout-grid__cell stretch-card mdc-layout-grid__cell--span-12">
                    <div class="mdc-card">
                      <form action="../createEvent" method="post" class="volunter-form">
                        <section class="mdc-card__primary">
                          <h1 class="mdc-card__title mdc-card__title--large">Create Event</h1>
                        </section>
                        <section class="mdc-card__supporting-text">
                          <div class="mdc-layout-grid__inner">
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-wrapper">
                                  <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                    <input name="event" required pattern=".{8,}" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Event">
                                  </div>
                                  <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                    Must be at least 8 characters
                                  </p>
                                </div>
                              </div>
                            </div>
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-wrapper">
                                  <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                    <input name="description" required pattern=".{8,}" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Description">
                                  </div>
                                  <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                    Must be at least 8 characters
                                  </p>
                                </div>
                              </div>
                            </div>
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-leading-wrapper">
                                  <div id="tf-box-leading-example" class="mdc-text-field mdc-text-field--box mdc-text-field--with-leading-icon w-100">
                                    <i class="material-icons mdc-text-field__icon" tabindex="0" onclick="">event</i>
                                    <input type="text" name="date" id="datepicker" class="mdc-text-field__input" placeholder="Select Date">
                                    
                                    <div class="mdc-text-field__bottom-line"></div>
                                  </div>
                                </div>
                              </div>
                            </div>
                          </div>
                          <div class="mdc-layout-grid__inner">
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-wrapper">
                                  <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                    <input name="time" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Time">
                                  </div>
                                  <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                    Must be at least 8 characters
                                  </p>
                                </div>
                              </div>
                            </div>
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-wrapper">
                                  <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                    <input name="volunteerId" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Volunteer ID">
                                  </div>
                                  <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                    Must be at least 8 characters
                                  </p>
                                </div>
                              </div>
                            </div>
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-wrapper">
                                  <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                    <input name="location" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Location">
                                  </div>
                                  <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                    Must be at least 8 characters
                                  </p>
                                </div>
                              </div>
                            </div>
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-wrapper">
                                  <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                    <input name="sponsers" required pattern=".{8,}" type="text" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message" placeholder="Enter Sponsers">
                                  </div>
                                  <p class="mdc-text-field-helper-text mdc-text-field-helper-text--validation-msg" id="name-validation-msg">
                                    Must be at least 8 characters
                                  </p>
                                </div>
                              </div>
                            </div>
                          </div>
                          <div class="mdc-layout-grid__inner">
                            <div class="mdc-layout-grid__cell mdc-layout-grid__cell--span-4-desktop">
                              <div class="template-demo">
                                <div id="demo-tf-box-wrapper">
                                  <div id="tf-box-example" class="mdc-text-field mdc-text-field--box w-100">
                                    <input type="submit" value="Create Event" id="tf-box" class="mdc-text-field__input" aria-controls="name-validation-message">
                                  </div>
                                </div>
                              </div>
                            </div>
                          </div>
                        </section>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </main>
            <!--content-->
          <jsp:include page="blocks/footer.jsp"></jsp:include>
      </div>
    </div>
  </body>
</html>
