package com.spring.hero.constant;

/**
 * @author daiqun
 * @version 2019.04.29
 */
public class Constants {

    // Resource
    public static final String APPLICATION_CONTEXT = "classpath:application-context.xml";
    public static final String SPRING_MVC = "classpath:spring-mvc.xml";

    // Model url
    public static final String APP_URL_PREFIX = "page";
    public static final String APP_URL_USER_PREFIX = "/page/user";
    public static final String APP_URL_QUESTION_PREFIX = "/page/question";
    public static final String APP_URL_EXAM_PREFIX = "/page/exam";
    public static final String FIVE_HUNDRED_PAGE = "/static/500.html";

    // User session
    public static final String APP_CONTEXT_USER = "APP_CONTEXT_USER";
    public static final String APP_CONTEXT_REQUEST = "APP_CONTEXT_REQUEST";
    public static final String APP_CONTEXT_RESPONSE = "APP_CONTEXT_RESPONSE";
    public static final String APP_CONTEXT_SESSION = "APP_CONTEXT_SESSION";

    // Question page
    public static final String CURRENT_PAGE = "currentPage";
    public static final String SEARCHKEY = "searchKey";
    public static final String STATUS = "status";
    public static final String PAGE_SIZE = "pageSize";
    public static final String QUESTION_LIST = "questionList";
    public static final String PAGINATION = "pagination";
    public static final String KEYWORD = "keyword";
    public static final String SORTWAY = "sortWay";
    public static final String PAGESIZE = "pageSize";
    public static final String PAGEITEM = "pageItem";
    public static final String EDIT_ID = "editId";
    public static final String CORRECT_ANWSER = "correctAnwser";
    public static final String ANWSER_A = "anwsera";
    public static final String ANWSER_B = "anwserb";
    public static final String ANWSER_C = "anwserc";
    public static final String ANWSER_D = "anwserd";
    public static final String QUESTION_CONTENT = "questionContent";
    public static final String THIS_ID = "thisId";
    public static final String THIS_QUESTION = "thisQuestion";
    public static final String UPDATE_FALSE_QUESTION = "update_fail_question";;

    // Sort way
    public static final String SORT_DESC = "desc";
    public static final String SORT_ASC = "asc";
    public static final String LIMIT = "LIMIT ";

    // Question sql
    public static final String QUERY_CONTENT = "SELECT q.id, q.question_content, q.choice_A, q.choice_B, q.choice_C, q.choice_D, q.correct_anwser FROM question q ";
    public static final String QUERY_BY_CONTENT_LIKE = "WHERE q.question_content LIKE ? AND q.is_delete = 0 ";
    public static final String QUERY_BY_QUESTION_ID = "WHERE q.id = ? AND q.is_delete = 0 ";
    public static final String QUERY_QUESTION_EXIST = "WHERE q.is_delete = 0 ";
    public static final String SORT_BY_ID_DESC = "ORDER BY q.id DESC ";
    public static final String SORT_BY_ID_ASC = "ORDER BY q.id ASC ";
    public static final String COUNT_QUESTION = "SELECT COUNT(*) FROM question q ";
    public static final String QUERY_BY_CONTENT = "WHERE q.question_content LIKE ? AND q.is_delete = 0 ";
    public static final String ADD_QUESTION = "INSERT INTO question(user_id, question_content, choice_A, choice_B, choice_C, choice_D, correct_anwser, create_time, update_time, create_by, update_by) VALUES(?, ?, ?, ?, ?, ?, ?, NOW(), NOW(), ?, ?)";
    public static final String DELETE_QUESTION_SQL = "UPDATE question q SET q.is_delete = 1 WHERE q.id = ?";
    public static final String EDIT_QUESTION = "UPDATE question SET question_content = ?, choice_A = ?, choice_B = ?, choice_C = ?, choice_D = ?, correct_anwser = ?, update_time = NOW(), update_by = ? WHERE id = ?";

    // Session filter
    public static final String PASS_PAGES = "passPages";
    public static final String GET_ACTION = "get";
    public static final String SAVE_LOGIN_ACTION = "user/login?go=";
    public static final String LOGIN_ACTION = "user/login";

    // Util
    public static final String UTF_8 = "UTF-8";
    public static final String ENCODE = "Encode";
    public static final String MD5 = "MD5";
    public static final String DATE_FORMATE = "yyyy-MM-dd HH:mm:ss";
    public static final String EXAM_DATE_FORMATE = "yyyy-MM-dd HH:mm";

    // Checkinfo
    public static final Integer USERNAME_IS_ERROR_CODE = 100;
    public static final Integer PASSWORD_IS_ERROR_CODE = 101;
    public static final Integer CHOICE_ANWSER_ERROR_CODE = 201;
    public static final Integer PROBLEM_IS_REPEATED = 111;

    public static final String USERNAME_IS_NULL = "USERNAME_IS_NULL";
    public static final String PASSWORD_IS_NULL = "PASSWORD_IS_NULL";
    public static final String SAVE_SNAP_NAME = "SAVE_SNAP_NAME";
    public static final String SAVE_SUCCESS_NAME = "SAVE_SUCCESS_NAME";

    public static final String PARAMS_FIELDS = "PARAMS_FIELDS";
    public static final String CHECK_FIELDS = "CHECK_FIELDS";
    public static final String CHECK_REPEATED = "CHECK_REPEATED";

    // Question if null
    public static final String QUESTION_CONTENT_IS_NULL = "QUESTION_CONTENT_IS_NULL";
    public static final String CHOICE_A_IS_NULL = "CHOICE_A_IS_NULL";
    public static final String CHOICE_B_IS_NULL = "CHOICE_B_IS_NULL";
    public static final String CHOICE_C_IS_NULL = "CHOICE_C_IS_NULL";
    public static final String CHOICE_D_IS_NULL = "CHOICE_D_IS_NULL";
    public static final String CORRECT_ANWSER_IS_NULL = "CORRECT_ANWSER_IS_NULL";

    // Exam is null
    public static final String EXAM_MUST_REQUIRED = "EXAM_MUST_REQUIRED";
    public static final String EXAM_REQUIRED_IS_NULL = "Required must not be empty";

    public static final String SUCCESS_FLASH_MESSAGE = "SUCCESS_FLASH_MESSAGE";

    // DBInfo
    public static final String JDBC_DRIVER = "jdbc.driver";
    public static final String JDBC_URL = "jdbc.url";
    public static final String JDBC_USERNAME = "jdbc.username";
    public static final String JDBC_PASSWORD = "jdbc.password";
    public static final String JDBC_PROPERTIES = "app.properties";
    public static final String PAGINATION_ITEM = "pagination.item";

    // Number and qutoes
    public static final String STRING_ZERO = "0";
    public static final String STRING_ONE = "1";
    public static final String COMMA = ",";
    public static final String HASHTAG = "#";
    public static final String STING_EMPTY = "";
    public static final String QUESTION_MARK = "?";
    public static final String PERCENT_SIGN = "%";
    public static final String KEY_PAGE_SIZE = "pagination.pageSize";
    public static final String FALSE = "false";
    public static final String COLON = ":";
    public static final String SLASH = "/";
    public static final String AND = "&";
    public static final String POINT = ".";
    public static final String UNDERLINE = "_";
    public static final String LEFT_BRACKETS = "{";
    public static final String RIGHT_BRACKETS = "}";
    public static final String SEMICOLON = ";";
    public static final String QUOTATION_MARKS = "'";

    // Property info
    public static final String USER = "USER";
    public static final String USERNAME_IS_REQUIRED = "UserName is required";
    public static final String PASSWORD_IS_REQUIRED = "Password is required";
    public static final String LOGIN_IS_ERROR = "User name does not exist or the password is incorrect";
    public static final String QUESTION_CONTENT_IS_REQUIRED = "Question content is required";
    public static final String CHOICE_A_IS_REQUIRED = "Choice A is required";
    public static final String CHOICE_B_IS_REQUIRED = "Choice B is required";
    public static final String CHOICE_C_IS_REQUIRED = "Choice C is required";
    public static final String CHOICE_D_IS_REQUIRED = "Choice D is required";
    public static final String CORRECT_ANWSER_IS_REQUIRED = "Correct anwser is required";
    public static final String ANWSER_REPEATED = "Answer to the question can not be repeated";
    public static final String QUESTION_NAME_REPEATED = "Question name can not be repeated";

    // Question flash message
    public static final String ADD_QUESTION_SUCCESS = "Add the problem successfully";
    public static final String Delete_QUESTION_SUCCESS = "Delete the problem successfully";
    public static final String EDIT_QUESTION_SUCCESS = "Modify the problem successfully";

    // Question flash message
    public static final String ADD_EXAM_SUCCESS = "Add the exam successfully";

    // User
    public static final String USER_LOGIN = "SELECT u.id, u.user_name, u.password FROM user u WHERE u.user_name = ?";
    public static final String CREATE_USER = "INSERT INTO user(user_name, password, create_time, update_time, create_by, update_by, gender, phone_number, email, chinese_name) VALUES(?, ?, NOW(), NOW(), ?, ?, ?, ?, ?, ?)";
    public static final String GIVE_USER_ROLE = "INSERT INTO user_role(user_id, role_id, create_time, update_time, create_by, update_by) VALUES(?, ?, NOW(), NOW(), ?, ?)";
    public static final String SQL_FIND_USERSHOW_BY_NAME = "SELECT u.id, u.user_name, r.name FROM user u INNER JOIN user_role ur ON u.id = ur.user_id "
            + " INNER JOIN role r ON ur.role_id = r.id WHERE u.user_name LIKE ?";

    // Log4j
    public static final String LOG_BEGIN_METHOD = "log Begining method: ";
    public static final String LOG_END_METHOD = "log Ending method: ";

    // Choice pageSize
    public static final int PAGE_SIZE_NODE_1 = 5;
    public static final int PAGE_SIZE_NODE_2 = 10;
    public static final int PAGE_SIZE_NODE_3 = 15;
    public static final int PAGE_SIZE_NODE_4 = 20;
    public static final int PAGE_SIZE_NODE_5 = 25;
    public static final int PAGE_SIZE_NODE_6 = 30;

    public static final int INT_INITIAL_VALUE = 0;
    public static final int INT_NUMBER_ONE = 1;
    public static final int INT_NUMBER_TWO = 2;
    public static final int INT_NUMBER_THREE = 3;
    public static final int INT_NUMBER_FOUR = 4;
    public static final int INT_NUMBER_FIVE = 5;
    public static final int INT_NUMBER_SIX = 6;
    public static final int INT_NUMBER_SEVEN = 7;
    public static final int INT_NUMBER_EIGHT = 8;
    public static final int INT_NUMBER_NINE = 9;
    public static final int INITIAL_PAGE_VALUE = 1;
    public static final int INT_NUMBER_32 = 32;

    public static final String QUESTION_PAGE_SIZE = "pageSize";
    public static final String QUESTION_PAGE_SIZE_DEFAULT = "10";
    public static final String QUESTION_CURRENT_PAGE = "currentPage";
    public static final String QUESTION_CURRENT_PAGE_DEFAULT = "1";
    public static final String QUESTION_DELETE_CHOICE = "allId";
    public static final String RETURN_NAME = "returnName";

    // Question URL
    public static final String QUESTION_LIST_JSP = "question/question_list";
    public static final String QUESTION_ADD_JSP = "question/question_add";
    public static final String QUESTION_EDIT_JSP = "question/question_edit";
    public static final String QUESTION_DETAILS_JSP = "question/question_details";
    public static final String QUESTION_PAGE = "question/show";

    // Question Hidden domain
    public static final String QUESTION_METHOD_SHOW = "/show";
    public static final String QUESTION_METHOD_SAVE = "/save";
    public static final String QUESTION_METHOD_EDIT = "/edit/{id}";
    public static final String QUESTION_METHOD_DELETE = "/delete";
    public static final String QUESTION_METHOD_DETAILS = "/details/{id}";
    public static final String QUESTION_METHOD_GET_BY_NAME = "/getByName";

    // Question input hidden value
    public static final String QUESTION_PAGE_SORT = "status";
    public static final String QUESTION_PAGE_KEYWORD = "keyword";
    public static final String QUESTION_PAGE_KEYWORD_DEFAULT = "";
    public static final String PAGE_ID = "id";
    public static final String PAGE_ID_INITIAL_VALUE = "0";

    // User URL
    public static final String LOGIN_JSP = "login";
    public static final String LOGIN_PAGE = "user/login";
    public static final String USER_LIST_PAGE = "user/show";

    // User Hidden domain
    public static final String LOGIN_METHOD_LOGIN = "/login";
    public static final String LOGIN_METHOD_LOGOUT = "/logout";
    public static final String USER_CREATE_METHOD = "/create";
    public static final String USER_LIST_FIND_BY_NAME = "/findByName";
    public static final String LOGIN_SAVE_URL = "go";
    public static final String ECHO_URL = "queryString";
    public static final String STRING_DEFAULT_VALUE = "";

    // User FORM PARAM
    public static final String SAVELOGIN_FORM_PARAM_USERNAME = "userName";
    public static final String SAVELOGIN_FORM_PARAM_PASSWORD = "password";
    public static final String USER_PARAM = "user";
    public static final String USER_ROLE_PARAM = "userRole";
    public static final String LOGIN_PARAM_PROPERTY = "Username or password is not null";
    public static final String LOGIN_PARAM_ERROR = "Username is not exsit or password is error";
    public static final String REMENBER_ME_FLAG = "flag";

    // Question Dao
    public static final String CREATE_QUESTION = ".create";
    public static final String DELETE_QUESTION_METHOD = ".delete";
    public static final String UPDATE_QUESTION = ".update";
    public static final String GET_COUNT = ".getCount";
    public static final String GET_COUNT_BY_CONTENT = ".getCountByContent";
    public static final String GET_BY_ID = ".getById";
    public static final String FIND_BY_CONTENT = ".findByContent";

    // Question Dao params
    public static final String QUESTION_DAO_QUESTION_CONTENT = "questionContent";
    public static final String QUESTION_DAO_QUESTION_STATUS = "status";
    public static final String QUESTION_DAO_QUESTION_ENTITY = "question";
    public static final String QUESTION_DAO_QUESTION_OFFSET = "offset";
    public static final String QUESTION_DAO_QUESTION_PAGESIZE = "pageSize";

    // User Dao params
    public static final String GET_USER_BY_NAME = ".getByName";

    // UserRole Dao params
    public static final String CREATE = ".create";

    // Question service param
    public static final Integer QUESTION_SIZE = 4;

    // Util param
    public static final String STATIC_URL = "static_url";

    // Session params
    public static final String SESSION_METHOD_SETATTRIBUTE = "setAttribute";
    public static final String SESSION_METHOD_GETATTRIBUTE = "getAttribute";
    public static final String SESSION_METHOD_REMOVE_ATTRIBUTE = "removeAttribute";
    public static final String SESSION_METHOD_INVALIDATE = "invalidate";
    public static final String SESSION_METHOD_ABANDON = "abandon";
    public static final Integer SESSION_PARAM_NUMBER = 2;
    public static final Integer SESSION_PARAM_NUMBER_ONE = 1;

    // Format keyword
    public static final String ESCAPE_THE_QUESTION_MARK = "/?";
    public static final String ESCAPE_THE_PERCENT_SIGN = "/%";
    public static final String ESCAPE_THE_UNDERLINE = "/_";
    public static final String ESCAPE_THE_LEFT_BRACKETS = "/{";
    public static final String ESCAPE_THELEFT_BRACKETS = "/{";
    public static final String ESCAPE_THERIGHT_BRACKETS = "/}";
    public static final String ESCAPE_THESEMICOLON = "/;";
    public static final String ESCAPE_QUOTATION_MARKS = "/'";

    // Cookie util
    public static final String COOKIE_USERNAME = "userName";
    public static final String COOKIE_PASSWORD = "password";
    public static final String COOKIE_REMENBER_ME = "flag";
    public static final String COOKIE_REMENBER_ME_STRING = "rememberMe";
    public static final int INT_ZERO = 0;
    public static final int INT_SEVEN = 7;
    public static final int INT_TWENTY_FOUR = 24;
    public static final int INT_SIXTY = 60;

    // Exam controller params
    public static final String EXAM_JSP = "exam/exam_list";
    public static final String EXAM_ADD_JSP = "exam/exam_add";
    public static final String EXAM_METHOD_URL_SHOW = "/show";
    public static final String EXAM_METHOD_URL_SHOW_PAGE = "exam/show";
    public static final String EXAM_METHOD_URL_CREATE = "/create";
    public static final String EXAM_METHOD_URL_CREATE_JSP = "/create_page";
    public static final String EXAM_TIME_SET = "exam.time";
    public static final String EXAM_TIME_CHOICE = "examTimeChoice";
    public static final String TO_EXAM_SHOW_DO = "redirect: page/exam/show";
    public static final String MODEL_EXAM = "exam";
    public static final String EXAM_LIST = "examList";

    // Escape html code
    public static final String APOSTROPHE = "\"";
    public static final String ESCAPE_APOSTROPHE = "&quot;";
    public static final String VERSUS = "&";
    public static final String ESCAPSE_VERSUS = "&amp;";
    public static final String LESS_THAN = "<";
    public static final String ESCAPE_LESS_THAN = "&lt;";
    public static final String MORE_THAN = ">";
    public static final String ESCAPE_MORE_THAN = "&gt;";
    public static final String SPACE = "       ";
    public static final String ESCAPE_SPACE = "&nbsp;";
}
